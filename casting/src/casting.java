public class casting {
    public static void main(String[] args) {
        /* Create two variables.
        One variable should have a data type of double and the other one should have a data type of int.
        Set the double variable equal to 112.35 and set the in value to the double variable.
        You must explicitly cast your double into an in for the second variable.
        Please print them both to the console to match the below output.*/

        double myDouble = 112.35;
        int myInt = (int) myDouble;

        System.out.println("Double: " + myDouble);
        System.out.println("Int: " + myInt);

        /*Create two more variables.
        One variable should be a string variable that is equal to the number 49.
        Create another variable with the data type of int.
        The second variable should be equal to the first variable and cast using the parseInt() method.
        Please print them both to the console to match the below output.*/

        String myString = "49";
        int myInt2 = Integer.parseInt(myString);

        System.out.println("The String value is: " + myString);
        System.out.println("The integer value is: " + myInt2);

    }
}
