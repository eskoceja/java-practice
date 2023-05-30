package Algorithms;

import java.util.Arrays;

/*You don't have to read input or print anything.
Your task is to complete the function bubbleSort()
which takes the array and its size as input and sorts
the array using the bubble sort algorithm.
 */
public class BubbleSort {
    public static void main(String[] args) {

        //example 1
        int N = 5; //or could do numbers.length under the array
        int[] numbers = {4, 1, 3, 9, 7};
        System.out.println("Unsorted list: " + Arrays.toString(numbers));
        bubbleSort(numbers, N); //sorting using the bubble sort method
        System.out.println("Sorted list using Bubble Sort: " + Arrays.toString(numbers));
        System.out.println();

        //example 2
        int N1 = 10; //or could do numbers1.length under the array
        int[] numbers1 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Unsorted list: " + Arrays.toString(numbers1));
        bubbleSort(numbers1, N1);   //sorting using the bubble sort method
        System.out.println("Sorted list using Bubble Sort: " + Arrays.toString(numbers1));

    }

    //making the swap
    public static void bubbleSort(int[] array, int n) {
        int i, j, num;  //declaring variables as integers
        boolean swapped;    //declaring swapped as true boolean
        for (i = 0; i < n - 1; i++) {
            swapped = false;    //swap is false bc nothing has swapped, yet
            for (j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {  //if the array index checked is greater than the array
                    //swapping array indexes
                    num = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = num;
                    swapped = true;

                }
            }
            //if no two elements were swapped, break no need to continue the loop
            if (!swapped) {
                break;
            }
        }
    }

}
