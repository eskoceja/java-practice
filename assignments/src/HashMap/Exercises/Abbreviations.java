package HashMap.Exercises;
import java.util.ArrayList;
import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbreviations;

    public Abbreviations() {
        abbreviations = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        //adds new abbr and it's explanation
        abbreviations.put(abbreviation.toLowerCase(), explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        //checks if abbr has been added
        return abbreviations.containsKey(abbreviation.toLowerCase());
    }

    public String findExplanationFor(String abbreviation) {
        //finds explanation for abbr
        return abbreviations.get(abbreviation.toLowerCase());
    }

    public static void main(String[] args) {

        Abbreviations abbreviations = new Abbreviations();

        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");

        String text = "e.g. i.e. etc. lol";

        for (String part: text.split(" ")) {
            if(abbreviations.hasAbbreviation(part)) {
                part = abbreviations.findExplanationFor(part);
            }

            System.out.print(part);
            System.out.print(" ");
        }

        System.out.println();
    }
}
