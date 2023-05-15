package udemy;

import java.util.Scanner;

public class GettingUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a line of text: ");
        String line = scanner.nextLine();

        System.out.println("You entered: " + line);

        System.out.println("Enter an integer: ");
        int value = scanner.nextInt();

        System.out.println("The integer you entered: " + value);

        System.out.println("Enter a floating value: ");
        double decimal = scanner.nextDouble();

        System.out.println("Your float number entered is: " + decimal);

    }
}
