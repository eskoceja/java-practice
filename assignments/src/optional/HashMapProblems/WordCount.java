package optional.HashMapProblems;
import java.util.HashSet;
import java.util.HashMap;

public class WordCount {
    public static void main(String[] args) {
        String str = "apple banana apple strawberry banana banana";

        HashMap<String, Integer> frequencyMap = countWordFrequency(str);

        System.out.println(frequencyMap);

    }

    public static HashMap<String, Integer> countWordFrequency(String str) {
        HashMap<String, Integer> frequencyMap = new HashMap<>();

        //splitting words using white spaces
        String[] words = str.split("\\s+");

        //iterating over each word
        for(String word: words) {
            word = word.replaceAll("^[^a-zA-Z0-9]+|[^a-zA-Z0-9]+$", "");

            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }
        return frequencyMap;
    }
}
