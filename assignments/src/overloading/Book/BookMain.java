package overloading.Book;
import java.util.Scanner;
import java.util.ArrayList;

public class BookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        System.out.println("Library: \n" +
                "Entering nothing will stop the loop");

        while(true) {
            System.out.println("Name a book you like: ");
            String title = scanner.nextLine();

            if(title.isEmpty()) {
                System.out.println("You are exiting the loop");
                break;
            }

            System.out.println("Who wrote that book?");
            String author = scanner.nextLine();

            System.out.println("How many pages are in the book?");
            int pages = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Very cool! I'll have read it. When was it published?");
            int yearPublished = scanner.nextInt();
            scanner.nextLine();

            System.out.println("What would you rate the book?");
            double rating = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Oh! It was a New York Times Best Seller, right? (true or false)");
            boolean NYTimesBestSeller = scanner.nextBoolean();
            scanner.nextLine();

            Book book = new Book(title, author, pages, yearPublished, rating, NYTimesBestSeller);
            books.add(book);
        }

        System.out.println("What information would you like printed? (Options: titles or everything)");
        String choice = scanner.nextLine();

        if(choice.equals("titles")) {
            for(Book book: books) {
                if(book != null) {
                    System.out.println(book.getTitle());
                }
            }
        } else if (choice.equals("everything")) {
            for (Book book: books) {
                if(book != null) {
                    System.out.println(book.toString());
                }
            }
        }

    }
}
