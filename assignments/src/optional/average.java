package optional;
import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //making everything a double
        double numOne, numTwo, numThree, average;

        System.out.println("You will be entering three numbers and get their average. Let's begin!");
        System.out.println("Enter a number:");
        numOne = scanner.nextDouble();

        System.out.println("Enter another number:");
        numTwo = scanner.nextDouble();

        System.out.println("Enter a third number:");
        numThree = scanner.nextDouble();

        average = (numOne + numTwo + numThree) / 3;

        System.out.println("The average of " + numOne + ", " + numTwo + ", and " + numThree + " is: " + average);

    }
}
