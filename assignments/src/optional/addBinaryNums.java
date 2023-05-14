package optional;
import java.util.Scanner;

public class addBinaryNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a binary number: ");
        String biNum1 = scanner.nextLine();

        System.out.println("Enter another binary number: ");
        String biNum2 = scanner.nextLine();

        int decimal1 = Integer.parseInt(biNum1, 2);
        int decimal2 = Integer.parseInt(biNum2, 2);

        int sum = decimal1 + decimal2;

        String binarySum = Integer.toBinaryString(sum);

        System.out.println("Sum of two binary numbers: " + binarySum);

    }
}
