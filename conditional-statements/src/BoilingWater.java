import java.util.Scanner;

//Boiling Water Class
public class BoilingWater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Write a conditional statement that writes that the "Water is boiling!"
        if the number entered is greater than or equal to 212.*/

        System.out.println("Enter a number greater than 212: ");
        int temp = Integer.valueOf(scanner.nextLine());

        if (temp > 212) {
            System.out.println("Water is boiling!");
        } else {
            System.out.println("Water not boiling.");
        }

    }
}

//Number Comparisons Class
class NumberComparisons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Use all three conditional statements (if, else if, and else) to output one of the three statements
        depending on what the two numbers are.
            Same: Numbers are the same
            Number one is larger than number two: The first number was larger than the second
            Number two is larger than number one: The second number was larger than the first*/

        System.out.println("Enter a number: ");
        int numOne = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter another number: ");
        int numTwo = Integer.valueOf(scanner.nextLine());

        if( numOne == numTwo) {
            System.out.println("The numbers are the same");
        } else if (numOne > numTwo) {
            System.out.println("The first number was larger than the second");
        } else{
            System.out.println("The second number was larger than the first");
        }
    }
}

//Test Scores Class
class TestScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Depending on what the number is, return a statement telling the user what score they got on a test
        using a 10 point grading scale. For example,
        if the user enters 73, then the program should return "Your grade is a C."*/

        System.out.println("Enter your score (must be between 0 and 100): ");
        int score = Integer.valueOf(scanner.nextLine());

        if(score >= 90) {
            System.out.println("You made an A - for Amazing! :)");
        } else if (score >=80 && score <=89) {
            System.out.println("Good job! You made a B!");
        } else if (score >=70 && score <=79) {
            System.out.println("You made a C!");
        } else if (score >=60 && score <=69) {
            System.out.println("Uh-oh! You made a D!");
        } else if (score >= 0 && score <=59) {
            System.out.println("Oh no! You made an F! :(");
        } else {
            System.out.println("You score is not in range!");
        }

    }
}

//Same or Nah Class
class SameOrNah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Create a class called "SameOrNah" that accepts user input asking for two words.
        Write a conditional statement that writes that the "The words are the same"
        if the strings match, or it writes "The words are different" if the strings do not match.*/

        System.out.println("Enter a word: ");
        String firstWord = scanner.nextLine();

        System.out.println("Re-enter the same word: ");
        String secondWord = scanner.nextLine();

        if (firstWord.equalsIgnoreCase(secondWord)) {
            System.out.println("The words are the same");
        } else {
            System.out.println("The words are different");
        }

    }
}