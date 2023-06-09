package optional.calculator;

import java.util.Scanner;

public class Operations {

    public int sum(int a, int b) {
        return a + b;
    }

    public int difference(int a, int b) {
        return a - b;
    }

    public int product(int a, int b) {
        return a * b;
    }

    public double quotient(double a, double b) {
        return a / b;
    }

    public int modulus(int a, int b) {
        return a % b;
    }

    static void performBinaryOperations(Scanner scanner, Operations operation, String operationName) {

        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();

        int result;

        switch (operationName) {
            case "add":
                result = operation.sum(a, b);
                System.out.println("\u001B[35mThe sum is: " + result + "\u001B[0m\n");
                break;
            case "subtract":
                result = operation.difference(a, b);
                System.out.println("\u001B[35mThe difference is: " + result + "\u001B[0m\n");
                break;
            case "multiply":
                result = operation.product(a, b);
                System.out.println("\u001B[35mThe product is: " + result + "\u001B[0m\n");
                break;
            case "divide":
                double quotient = operation.quotient(a, b);
                System.out.println("\u001B[35mThe quotient is: " + quotient + "\u001B[0m\n");
                break;
            case "find the modulus":
                result = operation.modulus(a, b);
                System.out.println("\u001B[35mThe modulus is: " + result + "\u001B[0m\n");
                break;
            default:
                System.out.println(" \u001B[33m Invalid operation! \u001B[0m \n");
                break;
        }

    }

}
