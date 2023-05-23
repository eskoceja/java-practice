package DebuggingPractice;

//1. method to calculate the avg of an array of ints as input and return double
//2. test method with an array {1, 2, 3, 4, 5}, should return 3.0


import java.util.List;

public class Calculate {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        double arrayAvg = getAverage(numbers);
        System.out.println("Array Average: " + arrayAvg);

        //null pointer expression in like 20
//        int nullArray[] =  null;
//        System.out.println("nullArray[6]: " + nullArray[6]); //array index out of bounds bc null

        /* Null setting set in line 19
         * Used debugger to create a breakpoint where I was told to, line 20.
         * I could not access elements in the nullArray bc it has not been initialized
         * Unable to get index of the array for 2 reasons: array has not been initialized, and for that, it was out of bounds
         * In line 20 I also get an "Array reference expected" bc again, it is out of bounds and array bas not been initialized
         *
         * I was able to fix and test errors through the debugger to change the value of the variables
         * and print them out until something worked. I used also used the 'set into' feature to step into the problem (line 19)
         * and set a value, then I could test line 20. Once I found a code that works, I typed it out below:  */

        //fixing the null pointer exception:
        int[] correctArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("correctArray[6]: " + correctArray[6]);

        //logic error
        int x = 17;
        double y = 20;
//        int avg = (x + y) / 2; //returns 18, meaning it rounds DOWN
//        System.out.println("The average is: " + avg);

        /*The problem in the logic above is that it provides me with an output, but it is incorrect.
        * Because the division is being done with integers, getting the average rounds DOWN.
        * I used the debugger to change the avg and create a renderer ad changed one of the ints to a double
        * To fix this issue, I updated nums from int to doubles
        * *** this can actually be solved in multiple way: change both numbers to doubles, change one number to double before dividing
        *   either way, the average should also have to updated to output as a double*/

        double correctAvg = (x + y) / 2;
        System.out.println("Correct Average for x and y: " + correctAvg); //returns 18.5


    }

    public static double getAverage(int[] numbers) {
        int sum = 0;
        //go through integers and add them up
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        //divide them by .size or .length
        double average = sum / numbers.length;
        return average;
    }

}
