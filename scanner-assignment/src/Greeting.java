import java.util.Scanner;
//Greeting Class
public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Create a class called "Greeting" that accepts user input asking for the user's name.
        System.out.println("What is your name?");
        String text = scanner.nextLine();
        System.out.println("Hi " + text);
    }
}

//Hello There Class
class HelloThere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello there! How are you doing today?");
        String text1 = scanner.nextLine();

        System.out.println("Wow -  Interesting! Tell me more about yourself!");
        String text2 = scanner.nextLine();

        System.out.println("So today you're doing " + text1 + " and something interesting about you is: " + text2);
        System.out.println("Well, it was nice chatting with you. Goodbye!");

    }
}
//Superhero Class
class Superhero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's write a story about a superhero!");
        System.out.println("Who is the hero of your story?");
        String hero = scanner.nextLine();

        System.out.println("What is their superpower?");
        String superpower = scanner.nextLine();

        System.out.println("Here is the story: ");
        System.out.println("There once was a superhero named " + hero + ", who had the power of " + superpower + ".");
        System.out.println("As they grew older, " + hero + " saw that the world needed them.");
        System.out.println( hero + " used their ability to " + superpower + " to save the world.");

    }
}
//Variable Inputs Class
class VariableInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string of text:");
        String text = scanner.nextLine();

        System.out.println("Enter an integer:");
        int number = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter a double:");
        double decimal = Double.valueOf(scanner.nextLine());

        System.out.println("Enter a boolean value:");
        boolean torf = Boolean.valueOf(scanner.nextLine());

        System.out.println("Your string is: " + text);
        System.out.println("Your integer is: " + number);
        System.out.println("Your double is: " + decimal);
        System.out.println("Your boolean is: " + torf);
    }
}
