package Algorithms;
import java.util.ArrayList;

/*OPTIONAL BONUS:
You don't need to read input or print anything.
Your task is to complete the function search() which takes
the string S and the string pat as inputs and returns an array
denoting the start indices (1-based) of substring pat in the string S.
Note: You don't need to return -1 yourself when there are no possible answers, just return an empty list.*/
public class SearchPattern {
    public static void main(String[] args) {

        //example 1
        String str = "batmanandrobinarebat";
        String pattern = "bat";
        System.out.println("Looking for: " + pattern + " in : " + str);
        System.out.println("Index using Z-algorithm: " + search(pattern, str));
        System.out.println();

        //example 2
        String str1 = "abesdu";
        String pattern1 = "edu";
        System.out.println("Looking for: " + pattern1 + " in : " + str1);
        System.out.println("Index using Z-algorithm: " + search(pattern1, str1));

    }

    public static ArrayList<Integer> search(String pattern, String s) {
        int index = -1;     //if no index, then -1
        ArrayList<Integer> list = new ArrayList<>();

        int count = s.length(); //count is the length of the string
        while (count != 0) {    //while length is not 0
            index = s.indexOf(pattern, index + 1);  //get indexOf s from the pattern and string passed through param
            if (index == -1) {  //is the index is not empty or no more swaps can be made
                break;  //break, no need to keep looping
            }
            list.add(index + 1);    //add moved index to the array
            count--;    //decrement
        }
        return list;
    }

}
