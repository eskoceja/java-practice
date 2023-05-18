package CollectionsAndErrorHandling;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* DONE 1) Define a List of integers with at least one set of duplicates.
DONE 2) Use a Set to remove duplicates.
DONE 3) Calculate the sum and average of the integers.
DONE 4) Print the sum, average, and the list of integers without duplicates.
DONE 5) Handle exceptions, such as IndexOutOfBoundsException, IllegalArgumentException, and ArithmeticException.
DONE 6) Use try-catch-finally and multi-catch blocks as needed.*/
public class Main {
    public static void main(String[] args) {

        //1
        List<Integer> integerList = new ArrayList<>();
        integerList.add(28);
        integerList.add(29);
        integerList.add(28); //duplicate
        integerList.add(27);
        integerList.add(30);
        integerList.add(26);

        try { //5 & 6
            //2
            Set<Integer> removeDups = new HashSet<>();
            removeDups.addAll(integerList);
            //3
            int sum = 0;
            for (int num : removeDups) {
                sum += num;
            }
            double avg = sum / removeDups.size();
            //4
            System.out.println(sum);
            System.out.println(avg);
            System.out.println(removeDups);

        } catch (IndexOutOfBoundsException iobe) {
            System.out.println("Index Out Of Bounds: " + iobe.getMessage());
        } catch (IllegalArgumentException iae) {
            System.out.println("Illegal Argument Expression: " + iae.getMessage());
        } catch (ArithmeticException ae) {
            System.out.println("Arithmetic Exception: " + ae.getMessage());
        } finally {
            System.out.println("Finally... this works, right?");
        }


    }
}
