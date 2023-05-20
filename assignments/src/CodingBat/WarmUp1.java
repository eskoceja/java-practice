package CodingBat;

public class WarmUp1 {

    public static void main(String[] args) {
        //testing
        WarmUp1 tester = new WarmUp1();

        System.out.println("Do I get to sleep in today? (5/19/23): " + tester.sleepIn(true, false));
        System.out.println("Are we in trouble with the monkeys' moods? " + tester.monkeyTrouble(false, false));
        System.out.println("What is the sum of 3 and 4? " + tester.sumDouble(3, 4));
        System.out.println("This one will double the difference from my age (28) to 21: " + tester.diff21(28) );
        System.out.println("Should the parrot be talking right now? " + tester.parrotTrouble(true, 17));
    }

    /*1.
     * The parameter weekday is true if it is a weekday,
     * and the parameter vacation is true if we are on vacation.
     * We sleep in if it is not a weekday or we're on vacation.
     * Return true if we sleep in.*/
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday) {                 //if it is NOT a weekday
            return true;                //we sleep in
        } else if (vacation) {          //if we are on vacation
            return true;                //we also sleep in
        } else {                        //otherwise on weekdays
            return false;               //we do not sleep in
        }
    }

    /*2
     * We have two monkeys, a and b, and the parameters aSmile and bSmile
     * indicate if each is smiling. We are in trouble
     * if they are both smiling or if neither of them is smiling.
     * Return true if we are in trouble.*/
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile == bSmile) {         //if both monkeys are in the same mood
            return true;                //we are in trouble
        } else {                        //otherwise
            return false;               //we are not in trouble
        }
    }

    /*3
     * Given two int values, return their sum. Unless the two values are the same,
     * then return double their sum.*/
    public int sumDouble(int a, int b) {
        if (a == b) {                       //if a and b are the same value
            return (a + b) * 2;             //double the sum
        } else {                            //otherwise
            return a + b;                   //just return the sum
        }
    }

    /*4
    *
    Given an int n, return the absolute difference between
    * n and 21, except return double the absolute difference
    * if n is over 21.*/
    public int diff21(int n) {
        if (n <= 21) {                      //if n is less than or equal to 21
            return 21 - n;                  //return the difference
        } else {                            //BUT if n is greater than 21
            return (n - 21) * 2;            //return the difference doubled (* 2)
        }
    }

    /*5
     *We have a loud talking parrot. The "hour" parameter is the current hour time
     * in the range 0..23. We are in trouble if the parrot is talking and the hour is
     * before 7 or after 20. Return true if we are in trouble. */
    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking && (hour < 7 || hour > 20)) {           //if the parrot is talking, and it is before 7am and after 11pm
            return true;                                    //true, we are in trouble
        } else {                                            //otherwise
            return false;                                   //we are not in trouble
        }
    }


}
