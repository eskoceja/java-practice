package optional.lambdaexpressions;

import java.io.*;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String fileToRead = "assignments/src/optional/lambdaexpressions/requirements.txt";  //path to file to be read
        String newFile = "assignments/src/optional/lambdaexpressions/output.txt";   //path to new output file

        try (BufferedReader reader = new BufferedReader(new FileReader(fileToRead));    //BufferedReader to read input file
             BufferedWriter writer = new BufferedWriter(new FileWriter(newFile))) {     //BufferedWriter to write into new output file

            List<String> lines = reader.lines().collect(Collectors.toList());   //storing content from input file into a list

            //count lines in file
            long lineCount = lines.size();  //getting number of lines using list method
            System.out.println("Number of lines in the requirements file: " + lineCount);

            //count words in file
            long wordCount = lines.stream()     //getting stream of lines
                    .flatMap(line -> List.of(line.split("\\s")).stream())   //splits line into words by looking for spaces: \\s (regex)
                    .count();   //counting content between spaces
            System.out.println("Number of words in the requirements file: " + wordCount);

            //find the longest word in file
            String longestWord = lines.stream() //getting stream of lines
                    .flatMap(line -> List.of(line.split("\\s")).stream())   //splits lines into words by looking for spaces
                    .max(Comparator.comparingInt(String::length))   //looking for word with max characters
                    .orElse("");
            System.out.println("Longest word in the file: " + longestWord);

            //sort words in alphabetical order in new file
            List<String> sortedWords = lines.stream()   //steam of lines in the list
                    .flatMap(line -> List.of(line.split("\\s")).stream())   //splits lines into words using regex code for spaces
                    .distinct() //removing duplicates
                    .sorted()   //sorting in alphabetical order
                    .collect(Collectors.toList());

            for(String word: sortedWords) { //for each word in the list
                writer.write(word); //write the words
                writer.newLine();   //in a new line
            }

            System.out.println("Text alphabetized in output file: " + newFile);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
