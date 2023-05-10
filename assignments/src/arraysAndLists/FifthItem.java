package arraysAndLists;
import java.util.Scanner;
import java.util.ArrayList;

//Fifth Item Class
public class FifthItem {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();
        int count = 0;
        System.out.println("Enter at least 5 strings (or enter nothing to exit): ");

        while(true) {
            String input = scanner.nextLine();

            if(input.isEmpty()){
                System.out.println("You're out of the cycle.");
                break;
            }
            inputs.add(count, input);
            count ++;
        }
        if(count >= 5) {
            System.out.println("The fifth item in the list is: " + inputs.get(4));
        } else {
            System.out.println("You entered less than 5 words!");
        }

    }
}

//How Large Class
class HowLarge {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();
        System.out.println("Enter a list of strings (or nothing to exit and see how many items you listed): ");

        while(true) {
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                int size = inputs.size();
                System.out.println("The total number of items in the list was: " + size);
                break;
            }
            inputs.add(input);
        }
    }

}

//Last Item Class
class LastItem {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();
        System.out.println("Enter a list of strings (or nothing to exit and see last item listed): ");

        while(true) {
            String input = scanner.nextLine();

            if(input.isEmpty()){
                int size = inputs.size();
                String lastItem = inputs.get(size - 1);
                System.out.println("The last item in the list is: " + lastItem );
                break;
            }
            inputs.add(input);
        }
    }
}

//Index of Integer Class
class IndexOfInteger {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputs = new ArrayList<>();
        System.out.println("Enter numbers to store (or 0 to exit): ");

        while(true) {
            int input = scanner.nextInt();

            if(input == 0){
                System.out.println("Done entering integers to the list.");
                break;
            }
            inputs.add(input);
        }
        System.out.println("What number are you looking for in the list?");
        int searchNum = scanner.nextInt();

        for (int i = 0; i < inputs.size(); i++){
            if(searchNum == inputs.get(i)){
                System.out.println(searchNum + " is at index " + i);
            }
        }
    }
}

//Sum of List Class
class SumOfList {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputs = new ArrayList<>();

        System.out.println("Enter integers, then 0 to get the sum: ");
        int input = scanner.nextInt();

        while(input != 0) {
            inputs.add(input);
            input = scanner.nextInt();
        }
        int sum = sum(inputs);
        System.out.println(inputs + " were the items in the list. The sum of that list is: " + sum);
    }
    public static int sum(ArrayList<Integer> inputs) {
        int sum = 0;
        for (Integer input : inputs) {
            sum += input;
        }
        return sum;
    }
}
