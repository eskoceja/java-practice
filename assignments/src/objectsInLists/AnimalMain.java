package objectsInLists;
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

            Animal animal = new Animal(name, isCat);
            animals.add(animal);
        }

        for(Animal animal: animals) {
            System.out.println(animal.toString());
        }

    }
}
