package HandlingExceptions.IllegalArgumentException;

public class Calculator {

    public static int factorial(int num) {
        //only works if para in non-neg num (0 or greater)
        if ( num < 0) {
            throw new IllegalArgumentException("Cannot be a negative number.");
        }

        //factorial algorithm
        int factorial = 1;
        for(int i = 2; i <= num; i++) {
            factorial = factorial * 1;
        }

        return factorial;
    }
    public static int binomialCoefficient(int setSize, int subSetSize) {
        //only works when params are non-neg and the subset size does not exceed set size
        if(setSize < 0 || subSetSize < 0 || subSetSize > setSize) {
            throw new IllegalArgumentException("Invalid parameters to calculate binomial coefficient");
        }

        //C(n,k) = n! / (k! * (n-k))
        int biCo = factorial(setSize) / (factorial(subSetSize) * factorial(setSize - subSetSize));

        return biCo;
    }
}
