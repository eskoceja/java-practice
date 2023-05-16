package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import static HashMap.Library.sanitizedString;

public class Main {
    public static void main(String[] arg) {
        HashMap<String, String> postalCodes = new HashMap<>();

        postalCodes.put("00710", "Helsinki");
        postalCodes.put("90014", "Oulu");
        postalCodes.put("33720", "Tampere");
        postalCodes.put("33014", "Tampere");

        System.out.println(postalCodes.get("00710"));

        HashMap<String, String> numbers = new HashMap<>();

        numbers.put("One", "Uno");
        numbers.put("Two", "Dos");

        String translation = numbers.get("One");
        System.out.println(translation);

        System.out.println(numbers.get("Two"));
        System.out.println(numbers.get("Three"));
        System.out.println(numbers.get("Uno"));

        numbers.put("Uno", "One");
        numbers.put("Dos", "Zwei");
        numbers.put("Uno", "Ein");

        String translationUno = numbers.get("Uno");
        System.out.println(translationUno);

        System.out.println(numbers.get("Dos"));
        System.out.println(numbers.get("Tres"));
        System.out.println(numbers.get("Uno"));

        HashMap<String, Book> directory = new HashMap<>();

        Book senseAndSensibility = new Book("Sense and Sensibility", 1811, "...");
        Book prideAndPrejudice = new Book("Pride and Prejudice", 1813, "....");

        directory.put(senseAndSensibility.getName(), senseAndSensibility);
        directory.put(prideAndPrejudice.getName(), prideAndPrejudice);

        Book book = directory.get("Persuasion");
        System.out.println(book);
        System.out.println();
        book = directory.get("Pride and Prejudice");
        System.out.println(book);

        ArrayList<Book> books = new ArrayList<>();
        Book senseAndSensibility1 = new Book("Sense and Sensibility", 1811, "...");
        Book prideAndPrejudice1 = new Book("Pride and Predjudice", 1813, "....");
        books.add(senseAndSensibility1);
        books.add(prideAndPrejudice1);

        Book match = null;
        for(Book libro: books) {
            if (book.getName().equals("Sense and Sensibility")) {
                match = book;
                break;
            }
        }

        System.out.println(match);

        System.out.println(get(books, "Sense and Sensibility"));

        System.out.println();

        System.out.println(get(books, "Persuasion"));


        long start = System.nanoTime();
        System.out.println(get(books, "Sense and Sensibility"));

        System.out.println();

        System.out.println(get(books, "Persuasion"));
        long end = System.nanoTime();
        double durationInMillisecond = 1.0 * (end - start) / 1000000;
        System.out.println("The book search took " + durationInMillisecond);

        HashMap<String, Book> directory1 = new HashMap<>();
        long start1 = System.nanoTime();
        System.out.println(directory.get("Sense and Sensibility"));

        System.out.println();

        System.out.println(directory.get("Persuasion"));
        long end1 = System.nanoTime();
        double durationInMilliseconds = 1.0 * (end1 - start1) / 1000000;

        System.out.println("The book search took " + durationInMilliseconds + " milliseconds.");

        String text = "Pride and Prejudice";
        text = text.toLowerCase();
        text = text.trim();


        //Using Library Class
        Book senseAndSensibility2 = new Book("Sense and Sensibility", 1811, "...");
        Book prideAndPrejudice2 = new Book("Pride and Prejudice", 1813, "....");

        Library library = new Library();
        library.addBook(senseAndSensibility2);
        library.addBook(prideAndPrejudice2);

        System.out.println(library.getBook("pride and prejudice"));
        System.out.println();

        System.out.println(library.getBook("PRIDE AND PREJUDICE"));
        System.out.println();

        System.out.println(library.getBook("SENSE"));

        //primitive in hash maps
        HashMap<Integer, String> hashmap = new HashMap<>();
        hashmap.put(1, "Ole!");
//        HashMap<int, String> map2 = new HashMap<>(); //will not work

        int key = 2;
        HashMap<Integer, Integer> hashmap1 = new HashMap<>();
        hashmap1.put(key, 10);
        int value = hashmap1.get(key);
        System.out.println(value);

    }

    public static Book get(ArrayList<Book> books, String name) {
        for (Book book : books) {
            if (book.getName().equals(name)) {
                return book;
            }
        }
        return null;
    }

//going through hash map value
public ArrayList<Book> getBookByPart(String titlePart) {
    titlePart = sanitizedString(titlePart);

    ArrayList<Book> books = new ArrayList<>();

//    for(Book book : this.directory.values()) {
//        if(!book.getName().contains(titlePart)) {
//            continue;
//        }
//
//        books.add(book);
//    }

    return books;
}

}
