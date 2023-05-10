package methods;
import java.sql.SQLOutput;
import java.util.Scanner;

public class DivideMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 10-20: ");
        int num1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter a number between 1-9:");
        int num2 = Integer.valueOf(scanner.nextLine());

        divideNumbers(num1, num2);
    }

    public static void divideNumbers(int numOne, int numTwo) {
        if(numTwo == 0) {
            System.out.println("Do not divide the number by o!");
            return;
        }
        System.out.println(numOne + " / " + numTwo + " = " + (numOne*1.0 / numTwo));
    }
}

class MethodReturnTypes {
    public static void main(String[] args) {
        MethodReturnTypes mrt = new MethodReturnTypes();
        System.out.println(mrt.returnString());
        System.out.println(mrt.returnInt());
        System.out.println(mrt.returnBoolean());
    }
    public String returnString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        return "Your string of text is: " + name;
    }
    public Integer returnInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = Integer.parseInt(scanner.nextLine());
        return age;
    }
    public Boolean returnBoolean() {
        return true;
    }
}

class AverageMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter another number: ");
        int num2 = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter a third number: ");
        int num3 = Integer.valueOf(scanner.nextLine());

        double avg = average(num1, num2, num3);

        System.out.println("The average of " + num1 + ", " + num2 + ", and " + num3 + " is: " + avg);
    }
    public static int sum(int num1, int num2, int num3) {
        return num1 +  num2 + num3;
    }
    public static double average(int num1, int num2, int num3) {
        int total = sum(num1, num2, num3);
        return (double)total / 3;
    }
}