package Algorithms;
import java.util.Arrays;

/*You don't need to read input or print anything.
Your task is to complete the functions partition()
and quickSort() which takes the array arr[], low and high
as input parameters and partitions the array. Consider the
last element as the pivot such that all the elements less than
(or equal to) the pivot lie before it and the elements
greater than it lie after the pivot.*/
public class QuickSort {
    public static void main(String[] args) {

        //example 1
        int[] numbers = {4, 1, 3, 9, 7};
        System.out.println("Unsorted list: " + Arrays.toString(numbers));
        int N = 5;
        quickSort(numbers, 0, N-1);
        System.out.println("Sorted list using Quick Sort: " + Arrays.toString(numbers));
        System.out.println();

        //example 2
        int[] data = {2, 1, 6, 10, 4, 1, 3, 9, 7};
        System.out.println("Unsorted list: " + Arrays.toString(data));
        int N1 = 9;
        quickSort(data, 0, N1-1);
        System.out.println("Sorted list using Quick Sort: " + Arrays.toString(data));

    }

    public static int partition(int[] array, int low, int high) {

        int pivot = array[high];    //choosing the pivot
        int i = low - 1;    //index of smaller num, and indicates position to right
        for (int j = low; j <= high; j++) {
            if (array[j] < pivot) { //if the element is smaller than the pivot
                i++;    //increment
                int num = array[i];
                array[i] = array[j];
                array[j] = num;
            }
        }
        i++;    //increment
        int num = array[i]; //swap
        array[i] = pivot;
        array[high] = num;
        return i;
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pIndex = partition(array, low, high);   //participating index now in the correct place
            quickSort(array, low,  pIndex - 1); //sorting elements before partition
            quickSort(array,  pIndex + 1, high);    //sorting elements after partition
        }
    }

}
