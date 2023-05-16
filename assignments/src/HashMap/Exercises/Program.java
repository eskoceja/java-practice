package HashMap.Exercises;
import java.util.HashMap;

public class Program {
    public static void printKeys(HashMap<String,String> hashmap) {
        //prints all keys in hashmap
        for(String key: hashmap.keySet()) {
            System.out.println(key);
        }
    }
    public static void printKeysWhere(HashMap<String,String> hashmap, String text) {
        //prints keys in hashmap given as param
        for(String key: hashmap.keySet()) {
            if(key.contains(text)) {
                System.out.println(key);
            }
        }
    }
    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text) {
        //prints values of given hashmap
        for(String key: hashmap.keySet()) {
            if(key.contains(text)) {
                System.out.println(hashmap.get(key));
            }
        }
    }
    public static void printValues(HashMap<String,Book> hashmap){
        //prints values in hashmap
        for(Book book: hashmap.values()) {
            System.out.println(book.toString());
        }
    }
    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text) {
        //prints books in hashmap
        for(Book book: hashmap.values()) {
            if(book.getName().contains(text)) {
                System.out.println(book.toString());
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> hashmap1 = new HashMap<>();
        hashmap1.put("f.e", "for example");
        hashmap1.put("etc.", "and so on");
        hashmap1.put("i.e", "more precisely");

        printKeys(hashmap1);
        System.out.println("---");
        printKeysWhere(hashmap1, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap1, ".e");

        //with book class
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");

    }
}
