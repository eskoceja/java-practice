package udemy;

import java.util.Scanner;

public class ArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = new String[3];

        words[0] = "hello";
        words[1] = "to";
        words[2] = "you";

//        System.out.println(words[2]);

        String[] fruits = {"apple", "banana", "pear", "kiwi"};

        for(String fruit: fruits) {
            System.out.println(fruit);
        }

        String[] texts = new String[2];
        System.out.println(texts[0]); //prints null bc it has been initialized, but no true value input

        texts[0] = "one";
        System.out.println(texts[0]);

    }
}
