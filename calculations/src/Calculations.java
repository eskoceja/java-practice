import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int numOne = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter another number: ");
        int numTwo = Integer.valueOf(scanner.nextLine());

        int addition = numOne + numTwo;
        int subtraction = numOne - numTwo;
        int multiplication = numOne * numTwo;
        double division = double.valueOf(numOne) / double.valueOf(numTwo);
        int modulus = numOne % numTwo;

        System.out.println("Addition: " + numOne + " + " + numTwo + " = " + addition);
        System.out.println("Subtraction: " + numOne + " - " + numTwo + " = " + subtraction);
        System.out.println("Multiplication: " + numOne + " * " + numTwo + " = " + multiplication);
        System.out.println("Division: " + numOne + " / " + numTwo + " = " + division);
        System.out.println("Modulus: " + numOne + " % " + numTwo + " = " + modulus);
    }
}

