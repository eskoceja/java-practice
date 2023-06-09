package optional.calculator;

import java.util.Scanner;

import static optional.calculator.Operations.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operations operations = new Operations();

        System.out.println("\n\u001B[34mWelcome to your handy-dandy calculator! \u001B[0m \n");

        boolean exit = false;

        while (!exit) {
            System.out.println("What would you like to do today?\n" +
                    "1. Find a sum \u001B[32m \u002B \u001B[0m \n" +
                    "2. Find a difference \u001B[32m \u002D \u001B[0m \n" +
                    "3. Find a product \u001B[32m \u002A \u001B[0m \n" +
                    "4. Find a quotient \u001B[32m \u002F \u001B[0m \n" +
                    "5. Find a modulus \u001B[32m \u0025 \u001B[0m \n" +
                    "0. Exit \u001B[31m \u219C \u001B[0m \n");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1: //sum
                    performBinaryOperations(scanner, operations, "add");
                    break;
                case 2: //diff
                    performBinaryOperations(scanner, operations, "subtract");
                    break;
                case 3: //product
                    performBinaryOperations(scanner, operations, "multiply");
                    break;
                case 4: //quotient
                    performBinaryOperations(scanner, operations, "divide");
                    break;
                case 5: //modulus
                    performBinaryOperations(scanner, operations, "find the modulus");
                    break;
                case 0: //exit
                    System.out.println("\u001B[37m Good-bye! \u001B[0m ");
                    exit = true;
                    break;
                default:
                    System.out.println("\u001B[33m Invalid entry, try again! \u001B[0m \n");
                    break;
            }
        }

    }
}
