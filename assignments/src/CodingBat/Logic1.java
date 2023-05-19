package CodingBat;

public class Logic1 {

    /*1
     * When squirrels get together for a party, they like to have cigars.
     * A squirrel party is successful when the number of cigars is between 40 and 60,
     * inclusive. Unless it is the weekend, in which case there is no upper bound on
     * the number of cigars. Return true if the party with the given values is successful,
     * or false otherwise.*/
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend) {                                //if it's the weekend
            if (cigars >= 40) {                         //and squirrels smoke over 40 cigars
                return true;                            //it's true, it's okay
            } else {
                return false;                           //otherwise, false - not okay
            }
        } else {                                        //if it is NOT the weekend
            if (cigars >= 40 && cigars <= 60) {         //squirrels smoke between 40-60 cigars
                return true;                            //it's okay
            } else {                                    //otherwise
                return false;                           //false, not okay
            }
        }
    }


    /*2
     *You and your date are trying to get a table at a restaurant.
     * The parameter "you" is the stylishness of your clothes,
     * in the range 0..10, and "date" is the stylishness of your date's clothes.
     * The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes.
     * If either of you is very stylish, 8 or more, then the result is 2 (yes).
     * With the exception that if either of you has style of 2 or less, then the result is 0 (no).
     * Otherwise, the result is 1 (maybe). */
    public int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) {                //if you and your date are NOT styling and rank low on scale
            return 0;                               //you won't get a table, dress nicer!
        } else if (you >= 8 || date >= 8) {         //if you and your date are very stylish and score over an 8
            return 2;                               //then you definitely will get a table. Enjoy the meal!
        } else {                                    //otherwise, if you both look avg
            return 1;                               //you may get a table
        }
    }

    /*3
     * The squirrels in Palo Alto spend most of the day playing.
     * In particular, they play if the temperature is between 60 and 90 (inclusive).
     * Unless it is summer, then the upper limit is 100 instead of 90.
     * Given an int temperature and a boolean isSummer, return true if the squirrels play
     * and false otherwise.*/
    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer) {                             //if it is summer and temp is between 60-100 degrees
            return temp >= 60 && temp <= 100;       //return true
        } else if (!isSummer) {                     //but if it is not summer and temp is 60-90 degrees
            return temp >= 60 && temp <= 90;        //still okay, return true
        } else {                                    //otherwise, temp no bueno
            return false;                           //return false
        }
    }

    /*4
     *You are driving a little too fast, and a police officer stops you.
     * Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket.
     * If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1.
     * If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day,
     * your speed can be 5 higher in all cases. */
    public int caughtSpeeding(int speed, boolean isBirthday) {
        int speedLimit = 60;                            //say speed limit is 60mph

        if (isBirthday) {                               //on your birthday
            speedLimit += 5;                            //you can speed over 5mph - but BE CAREFUL
        }

        if (speed <= speedLimit) {                      //if the speed you're driving at is less than speed limit
            return 0;                                   //no ticket for you
        } else if (speed <= speedLimit + 20) {          //if the speed you're driving at is between 61-80 mph
            return 1;                                   //yeah, you may get a ticket
        } else {                                        //if you're driving faster than that
            return 2;                                   //yeah, you're getting a ticket because that is not safe!
        }
    }

    /*5
     *Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive,
     * are forbidden, so in that case just return 20. */
    public int sortaSum(int a, int b) {
        int sum = a + b;                        //check sum
        if (sum >= 10 && sum <= 19) {           //if the sum is between 10-19
            return 20;                          //just return 20
        } else {                                //otherwise
            return sum;                         //just return sum
        }
    }

    /*6
     *Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat,
     * and a boolean indicating if we are on vacation, return a string of the form "7:00"
     * indicating when the alarm clock should ring. Weekdays, the alarm should be "7:00" and
     * on the weekend it should be "10:00". Unless we are on vacation -- then on weekdays it
     * should be "10:00" and weekends it should be "off". */
    public String alarmClock(int day, boolean vacation) {
        if (vacation) {                         //if you are on vacay
            if (day >= 1 && day <= 5) {         //and it's the weekend
                return "10:00";                 //sleep in and wake up at 10
            } else {                            //otherwise
                return "off";                   //turn alarm off
            }
        } else {
            if (day >= 1 && day <= 5) {         //if not on vacay and it's the week day
                return "7:00";                  //wake up at 7
            } else {                            //otherwise
                return "10:00";                 //sleep in and wake up at 10
            }
        }
    }

    /*7
     *The number 6 is a truly great number. Given two int values, a and b,
     * return true if either one is 6. Or if their sum or difference is 6.
     * Note: the function Math.abs(num) computes the absolute value of a number. */
    public boolean love6(int a, int b) {
        if (a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6) {   //if a or b or the sum or the diff is 6
            return true;                                                //return true, we love 6
        } else {                                                        //otherwise
            return false;                                               //return false

        }
    }

    /*8
     *Given a number n, return true if n is in the range 1..10, inclusive.
     * Unless outsideMode is true, in which case return true if the number is
     * less or equal to 1, or greater or equal to 10. */
    public boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode) {                  //if we are outside and the number is NOT between 1-10
            return n <= 1 || n >= 10;       //return true
        } else {
            return n >= 1 && n <= 10;       //also true is the number is between the range
        }
    }


}
