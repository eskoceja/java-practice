package udemy;

public class WhileLoops {
    public static void main(String[] args) {
        boolean loop = true;
        boolean compare = 4 < 5;

        System.out.println(loop);
        System.out.println(compare);

        int value = 0;

        while (value < 10) {
            System.out.println("Hello " + value);

            value = value + 1;
//            value++; this also works
        }


    }
}
