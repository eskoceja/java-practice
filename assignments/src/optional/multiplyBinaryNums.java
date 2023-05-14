package optional;

import java.util.Scanner;

public class multiplyBinaryNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a binary number: ");
        String biNum1 = scanner.nextLine();

        System.out.println("Enter another binary number: ");
        String biNum2 = scanner.nextLine();

        int decimal1 = Integer.parseInt(biNum1, 2);
        int decimal2 = Integer.parseInt(biNum2, 2);

        int product = decimal1 * decimal2;

        String binaryProduct = Integer.toBinaryString(product);

        System.out.println("Product of two binary numbers: " + binaryProduct);

    }
}
