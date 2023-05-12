package overloading;
import java.util.Scanner;

public class CounterMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Counter counterA = new Counter(14); //start value of 14
        Counter counterB = new Counter(); //start value 0

        //display start value
        System.out.println("Counter A has a start value of 14: " + counterA.value());
        System.out.println("Counter B has a start value of 0: " + counterB.value());
        System.out.println("");

        //increase example
        counterA.increase(6);
        counterB.increase(7);

        //display increase
        System.out.println("Counter A is increased by 6: " + counterA.value());
        System.out.println("Counter B is increased by 7: " + counterB.value());
        System.out.println("");

        //decrease example
        counterA.decrease(4);
        counterB.decrease(2);

        //display decrease example
        System.out.println("Counter A is decreased by 4: " + counterA.value());
        System.out.println("Counter B is decreased by 2:  " + counterB.value());
        System.out.println("");

        //increase neg numbers
        counterA.increase(-2);
        counterB.increase(-2);

        //display increase neg numbers
        System.out.println("Counter A is increased by -2: " + counterA.value());
        System.out.println("Counter B is increased by -2:  " + counterB.value());
        System.out.println("");

        //decrease neg numbers
        counterA.decrease(-2);
        counterB.decrease(-2);

        //display decrease neg numbers
        System.out.println("Counter A is decreased by -2: " + counterA.value());
        System.out.println("Counter B is decreased by -2:  " + counterB.value());
        System.out.println("");

        //increase by 1 using non-overloaded method
        counterA.increase();
        counterB.increase();

        //display increase w/o overloaded method
        System.out.println("Counter A is increased by 1 using non-overloaded method: " + counterA.value());
        System.out.println("Counter B is increased by 1 using non-overloaded method:  " + counterB.value());
        System.out.println("");

        //decrease by 1 using non-overloaded method
        counterA.decrease();
        counterB.decrease();

        //display decrease using non-overloaded method
        System.out.println("Counter A is decreased by 1 using non-overloaded method: " + counterA.value());
        System.out.println("Counter B is decreased by 1 using non-overloaded method:  " + counterB.value());
        System.out.println("");

    }

}
