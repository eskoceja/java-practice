package optional;

import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a decimal number: ");

        int decimal = scanner.nextInt();

        String binary = Integer.toBinaryString(decimal);

        System.out.println("Binary number is: " + binary);
    }
}
