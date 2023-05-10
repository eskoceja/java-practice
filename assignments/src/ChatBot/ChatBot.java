package ChatBot;
import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.Period;

public class ChatBot {
    public static void main(String[] args){

        //green user and ask for name
        System.out.println(name());

        //ask for name again
        System.out.println(repeatName());

        //guessing age
        System.out.println(AgeCalc());

        //count to any number
        countTo();

        //testing users programming knowledge
        checkKnowledge();

        //silly statements
        switchStatements();
    }

    //greet and ask for name method
    public static String name() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi there! Thanks for joining me. What's your name?");
        String name = scanner.nextLine();
        System.out.println("Nice to meet you, ");
        return name;
    }

    //ask to repeat name method
    public static String repeatName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("I'm a silly bot and I need you to confirm your name. Please enter it AGAIN: ");
        String nameAgain = scanner.nextLine();
        System.out.println("Thanks for repeating your name");
        return nameAgain;
    }

    //guess age method
    public static int AgeCalc() {
        Scanner scanner = new Scanner(System.in);
        // Ask user for their birth year, month, and day
        System.out.println("What year were you born?");
        int birthYear = scanner.nextInt();
        System.out.println("What month were you born in (enter month number)?");
        int birthMonth = scanner.nextInt();
        System.out.println("What day were you born on?");
        int birthDay = scanner.nextInt();

        // Calculate age
        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        int age = period.getYears();

        // Print age
        System.out.println("I am going to guess your age is: ");
        return age;
    }

    //count to any number method
    public static void countTo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("I am just a bot made by an amateur but I can count. What number would you like me to count to?");
        int countToNum = scanner.nextInt();
        System.out.println("OKAY AMBITIOUS. I'll show you I can count to " + countToNum);

        for (int i = 0; i <= countToNum; i++) {
            System.out.println(i);
        }
    }

    //test knowledge method
    public static void checkKnowledge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's check your basic Java knowledge.");
        System.out.println("What is the correct way to declare a variable in Java?");
        System.out.println("A. var num = 10");
        System.out.println("B. int num = '10'");
        System.out.println("C. double num = 10.0");
        System.out.println("D. boolean num = true");

        boolean answer = false;

        while(!answer) {
            System.out.println("Enter: A, B, C or D");
            String correctAnswer = scanner.nextLine();

            switch (correctAnswer.toUpperCase()) {
                case "A":
                    System.out.println("Sorry, try again");
                    break;
                case "B":
                    System.out.println("Sorry, try again.");
                    break;
                case "C":
                    System.out.println("CORRECT! WELL DONE :)");
                    answer = true;
                    break;
                case "D":
                    System.out.println("Nope, try again");
                    break;
                default:
                    System.out.println("Enter a valid answer choice");
                    break;
            }
        }
    }

    //switch statement to output phrases for nums 1-7
    public static void switchStatements() {
        Scanner scanner = new Scanner(System.in);
        boolean response = false;

        while(!response) {
            System.out.println("Enter a number 1-7 for puns for each day of the week:");
            String userResponse = scanner.nextLine();

            switch (userResponse) {
                case "1":
                    System.out.println("Monday: I donut want to go to work today!");
                    break;
                case "2":
                    System.out.println("Tuesday: Taco 'bout a great day!");
                    break;
                case "3":
                    System.out.println("Wednesday: I'm halfway to the weekend, wine not celebrate?");
                    break;
                case "4":
                    System.out.println("Thursday: Throwback to Thirsty Thursday!");
                    break;
                case "5":
                    System.out.println("Friday: Fry-day? Don't mind if I do!");
                    break;
                case "6":
                    System.out.println("Saturday: I'm feeling egg-cited for the weekend!");
                    break;
                case "7":
                    System.out.println("Sunday: I'm loaf-ing around today!");
                default:
                    System.out.println("Enter a valid number (1-7)");
                break;
            }
        }
    }
}
