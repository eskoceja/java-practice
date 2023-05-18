package udemy;

public class StringBuilderAndStringFormatting {
    public static void main(String[] args) {
        //not efficient
        String info = "";

        info += "My name is Bob.";
        info += " ";
        info += "I am a builder.";

        System.out.println(info);

        //more efficient
        StringBuilder sb = new StringBuilder("");

        sb.append("My name is Emily.");
        sb.append(" ");
        sb.append("I am a lion tamer.");

        System.out.println(sb.toString());

        StringBuilder s = new StringBuilder();

        s.append("My name is Blakey.")
                .append(" ")
                .append("I am a nurse practitioner.");

        System.out.println(s.toString());

        //StringBuffer
        StringBuffer sbb = new StringBuffer();

        sbb.append("Just checking to see")
                .append(" ")
                .append("how this works!");
        System.out.println(sbb.toString());

        //-------------FORMATTING------------------//

        System.out.print("Here is some text. \t That was a tab. \n That was a new line.");
        System.out.println(" More text.");

        //printf --- formatting integers
        System.out.printf("Total cost %-10d; quantity is %d\n", 5, 120);

        for (int i = 0; i < 20; i++) {
            System.out.printf("%-2d: %s\n", i, "here is some text");
        }

        //formatting floating pt values
        System.out.printf("Total value: %.2f\n", 5.687); //.2 for 2 decimal places and rounds up
        System.out.printf("Total value is: %-6.1f\n", 343.23423);



    }
}
