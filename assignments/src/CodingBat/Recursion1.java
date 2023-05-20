package CodingBat;

public class Recursion1 {

    public static void main(String[] args) {
        //testing
        Recursion1 tester = new Recursion1();

        System.out.println("Return the factorial of 5: " + tester.factorial(7));
        System.out.println("If there are 17 bunnies, how many bunny ears are there total? " + tester.bunnyEars(17));
    }

    /*1
     *Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ...
     * 1. Compute the result recursively (without loops). */
    public int factorial(int n) {
        if (n == 0 || n == 1) {                 //if n is 0 or 1
            return 1;                           //return 1 because it's the smallest value to get a factorial
        } else {                                //otherwise
            return n * factorial(n - 1);    // return factorial of number
        }
    }

    /*2
     *We have a number of bunnies and each bunny has two big floppy ears.
     * We want to compute the total number of ears across all the bunnies recursively
     * (without loops or multiplication). */
    public int bunnyEars(int bunnies) {
        if (bunnies == 0) {                                     //if no bunnies
            return 0;                                           //no bunny ears
        } else {                                                //if there are bunnies
            return 2 + bunnyEars(bunnies - 1);          //return bunnies * 2 WITHOUT multiplying
        }
    }

}
