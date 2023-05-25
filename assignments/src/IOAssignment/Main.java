package IOAssignment;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Main {
    public static void main(String[] args) {

        //for me to remember, use: Path from source root
        String inputFile1 = "assignments/src/IOAssignment/input1.txt";
        String inputFile2 = "assignments/src/IOAssignment/input2.txt";
        String mergedFile = "assignments/src/IOAssignment/merged.txt";
        String commonFile = "assignments/src/IOAssignment/common.txt";

        try {
            //reading integers from both input files
            Set<Integer> set1 = readIntegersFromFile(inputFile1);
            Set<Integer> set2 = readIntegersFromFile(inputFile2);

            //Set for merging because with .retailAll it only takes what is duplicated
            Set<Integer> commonSet = new HashSet<>(set1);
            commonSet.retainAll(set2);

            //to display the merging a list will not remove duplicates
            List<Integer> mergeSet = new ArrayList<>(set1);
            mergeSet.addAll(set2);

            //printing sets to new file
            writeSetToFile(commonSet, commonFile);
            mergeSets(set1, set2, mergedFile);

            System.out.println("Common integers in a file: SUCCESS!!!! " + commonSet);
            System.out.println("Merging: SUCCESS!!!! " + mergeSet);
        } catch (NumberFormatException e) {
            System.out.println("Invalid, must be an integer: " + e.getMessage());
        }
    }

    //method to take in the integers from a file, reads them, and saves them to a collection
    // Set to organize them because we will have to find the common integers using Set method
    private static Set<Integer> readIntegersFromFile(String filename) {
        Set<Integer> set = new HashSet<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                set.add(Integer.parseInt(line));
            }
        } catch (IOException e) {
            System.out.println("Input/Output Exception" + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception" + e.getMessage());
        }
        return set;
    }

    //method to print to file, from the list created that reads ^^^
    private static void writeSetToFile(Set<Integer> set, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Integer num : set) {
                writer.write(num.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Input/Output Exception: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception" + e.getMessage());
        }
    }

    //method that takes two lists and prints the contents of each into a new file
    private static void mergeSets(Set<Integer> set1, Set<Integer> set2, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Integer num : set1) {
                writer.write(num.toString());
                writer.newLine();
            }
            for (Integer num : set2) {
                if (!set1.contains(num)) {
                    writer.write(num.toString());
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            System.out.println("Input/Output Exception: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception" + e.getMessage());
        }
    }
}
