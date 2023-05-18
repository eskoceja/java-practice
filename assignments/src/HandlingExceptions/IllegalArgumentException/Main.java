package HandlingExceptions.IllegalArgumentException;

public class Main {
    public static void main(String[] args) {

        //testing person
        //valid
        Person emily = new Person("Emily", 28);
        System.out.println(emily);
//
//        //error -- uncomment to verify
//        Person blake = new Person("Blake", 121);
//        System.out.println(blake);
//
//
//        //testing calc
//        //valid responses
        int factorial = Calculator.factorial(14);
        int biCo = Calculator.binomialCoefficient(14, 1);

        System.out.println(factorial);
        System.out.println(biCo);
//
//        //errors -- uncomment to verify
//        int invalidf = Calculator.factorial(-2);
//        int invalidbiCo = Calculator.binomialCoefficient(3, 5);
//
//        System.out.println(invalidf);
//        System.out.println(invalidbiCo);
    }
}
