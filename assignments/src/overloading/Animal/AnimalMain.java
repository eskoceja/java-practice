package overloading.Animal;
import java.util.Scanner;
import java.util.ArrayList;

public class AnimalMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();
        System.out.println("Pet Menu: \n" +
                "Entering nothing will stop the loop");
        while(true) {
            System.out.println("Please enter your pet's name: ");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                System.out.println("You are exiting the loop.");
                break;
            }
            System.out.println("Is your pet a cat? (yes or no)");
            String isCatInput = scanner.nextLine();
            boolean isCat = isCatInput.equalsIgnoreCase("yes");

            System.out.println("What breed is your pet?");
            String breed = scanner.nextLine();

            System.out.println("How much does your pet weigh?");
            double weight = scanner.nextDouble();

            System.out.println("How old in months is your pet?");
            int age = scanner.nextInt();

            System.out.println("Is your pet a baby? (yes or no)");
            String isBabyInput = scanner.nextLine();
            boolean isBaby = isBabyInput.equalsIgnoreCase("yes");
            scanner.nextLine();

            Animal animal = new Animal(name, isCat, age,  breed, weight, isBaby);
            animals.add(animal);
        }

        for(Animal animal: animals) {
            System.out.println(animal.toString());
        }

    }
}
