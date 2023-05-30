package Algorithms;
import java.util.Arrays;
/*OPTIONAL:
This is a function problem. You only need to complete the function countSort()
that takes string arr as a parameter and returns the sorted string.
The printing is done by the driver code.*/
public class CountingSort {
    public static void main(String[] args) {

        //example 1
        String array = "edsab";
        System.out.println("Unsorted string of letters: " + array);
        System.out.println("Sorted list of letters using Counting Sort: " + countSort(array));
        System.out.println();

        //example 2
        String letters = "geeksforgeeks";
        System.out.println("Unsorted string of letters: " + letters);
        System.out.println("Sorted list of letters using Counting Sort: " + countSort(letters));

    }

    public static String countSort(String arr) {

        char[] array = arr.toCharArray();   //takes in an array of char
        Arrays.sort(array);                 //sorting
        return new String(array);           //turing it back to a string

    }
}
