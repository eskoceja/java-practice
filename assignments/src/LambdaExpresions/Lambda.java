package LambdaExpresions;

import java.util.function.*;

import static java.lang.Integer.max;
import static java.lang.Integer.sum;

public class Lambda {
    public static void main(String[] args) {

        //1. Simple Functions
        BinaryOperator<Integer> add = (x, y) -> x + y;
        BinaryOperator<Integer> subtract = (x, y) -> x - y;
        BinaryOperator<Integer> multiply = (x, y) -> x * y;
        BinaryOperator<Integer> divide = (x, y) -> x / y;

        //testing simple functions
        System.out.println("Simple Functions: ");
        System.out.println(add.apply(15, 3));
        System.out.println(subtract.apply(15, 3));
        System.out.println(multiply.apply(15, 3));
        System.out.println(divide.apply(15, 3));
        System.out.println();

        //2. Using Functional Interfaces
        Addition sum = (x, y) -> x + y;
        Subtraction difference = (x, y) -> x-y;
        Multiplication product = (x, y) -> x * y;
        Division quotient = (x, y) -> x / y;

        //testing using functional interfaces
        System.out.println("Using Functional Interfaces: ");
        System.out.println(sum.addition(10, 5));
        System.out.println(difference.subtraction(10, 5));
        System.out.println(product.multiplication(10, 5));
        System.out.println(quotient.division(10, 5));
        System.out.println();

        //3. Using lambda expressions with built-in functional interfaces
        System.out.println("Using Lambda Expressions with built-in functional interfaces: ");
        Predicate<String> name = (String n) -> n.startsWith("B");
        System.out.println("PREDICATE: 'Emily' start with 'B': " + name.test("Emily"));

        Function<Integer, Integer> squared = n -> n * n;
        System.out.println("FUNCTION: What is 6 squared? " + squared.apply(6));

        Consumer<String> greeting = g -> System.out.println(g);
        greeting.accept("CONSUMER: Hello, World!");

        Supplier<Double> randomNumberSupplier = () -> Math.random();
        double randomNumber = randomNumberSupplier.get();
        System.out.println("SUPPLIER: Random Number: " + randomNumber);

    }
}
