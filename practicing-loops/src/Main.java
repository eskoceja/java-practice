import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

//Take A Break Class
class TakeABreak{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        String input;
        for( ; ; ){
            System.out.println("Do you want to take a break?");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("yes")) {
                break;
            }
        }
        System.out.println("Enjoy your break!");
    }
}

//Stop at 5 Class
class StopAtFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        for( ; ; ){
            System.out.println("What number am I thinking of?");
            num = Integer.valueOf(scanner.nextLine());

            if(num == 5) {
                System.out.println("Correct!");
                break;
            }
        }

    }
}

//Private Numbers Class
class PositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        for( ; ; ){
            System.out.println("Enter a positive number (or 0 to quit): ");
            num = Integer.valueOf(scanner.nextLine());

            if(num == 0 ) {
                System.out.println("You are quitting the game");
                break;
            } else if (num < 0) {
                System.out.println("Number must be positive");
            } else {
                System.out.println("You typed in " + num);
            }
        }

    }
}

//Count to Eleven Class
class CountToEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = -1;

        while (num < 0 || num >= 11) {
            System.out.print("Enter a number less than 11: ");
            num = scanner.nextInt();

            for (int i = num; i <= 11; i++) {
                System.out.println(i);
            }
        }

    }
}

//Multiplication Table Class
class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = Integer.valueOf(scanner.nextLine());

        System.out.println("Multiplication table for " + num + ": ");

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i ));
        }

    }
}