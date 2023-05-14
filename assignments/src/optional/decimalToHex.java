package optional;

import java.util.Scanner;

public class decimalToHex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter decimal number: ");
        int decimal = scanner.nextInt();

        String hexadecimal = Integer.toHexString(decimal).toUpperCase();

        System.out.println("Hexadecimal number is: " + hexadecimal);
    }
}
