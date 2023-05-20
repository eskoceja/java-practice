package CodingBat;

public class String1 {

    public static void main(String[] args) {
        //testing
        String1 tester = new String1();

        System.out.println("What's your name? " + tester.helloName("Emily"));
        System.out.println("I can speak robot, watch: " + tester.makeAbba("boop", "beep"));
        System.out.println("The is how you make something italicized in HTML: " + tester.makeTags("i", "Why is it spicy?"));
        System.out.println("Are you laughing at me? " + tester.extraEnd("aloha"));
        System.out.println("Hey! I said stop laughing! Do you not speak English? " + tester.firstTwo("jacuzzi"));

    }

    /*1
    *
    Given a string name, e.g. "Bob",
    * return a greeting of the form "Hello Bob!".*/
    public String helloName(String name) {
        return "Hello " + name + "!";
    }       //returning concatenated greeting with name

    /*2
     * Given two strings, a and b, return the result of putting them
     * together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".*/
    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }       // return strings in abba pattern by concatenating them

    /*3
     * The web is built with HTML strings like "<i>Yay</i>"
     * which draws Yay as italic text. In this example,
     * the "i" tag makes <i> and </i> which surround the word "Yay".
     * Given tag and word strings, create the HTML string with tags
     * around the word, e.g. "<i>Yay</i>".*/
    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
        // the tag is "i" and I just had to concatenate to make it look like an italicized tag on HTML
    }

    /*4
     *
    Given a string, return a new string made of 3 copies of the last 2 chars
    * of the original string. The string length will be at least 2.  */
    public String extraEnd(String str) {
        String lastTwoLetters = str.substring(str.length() - 2);
        //.subtring method allows you to get the last 2 indices of the string provided
        return lastTwoLetters + lastTwoLetters + lastTwoLetters;
        //then I saved them as variables and concatenated them
    }

    /*5
     * Given a string, return the string made of its first two chars,
     * so the String "Hello" yields "He". If the string is shorter than length 2,
     * return whatever there is, so "X" yields "X", and the empty string "" yields
     * the empty string "". Note that str.length() returns the length of a string.*/
    public String firstTwo(String str) {
        if (str.length() < 2) {                                 //if the string consisted of less than 2 chars
            return str;                                         //just return the string
        } else {                                                //otherwise
            String firstTwoLetters = str.substring(0, 2);       //get the first two letters only
            return firstTwoLetters;                             //and return those
        }
    }

}
