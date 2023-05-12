package objectsInLists;
import java.util.Scanner;
import java.util.ArrayList;

public class BookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        System.out.println("Library: \n" +
                "Entering nothing will stop the loop");

        Book book1 = new Book("A Court Of Thorns And Roses", 419, 2015);
        Book book2 = new Book("A Court Of Mist And Fury", 626, 2016);
        Book book3 = new Book("A Court Of Wings And Ruin", 699, 2017);
        Book book4 = new Book("A Court Of Frost And Starlight", 299, 2018);
        Book book5 = new Book("A Court Of Silver Flames",768, 2021);

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        while(true) {
            System.out.println("Name a book you like: ");
            String title = scanner.nextLine();

            if(title.isEmpty()) {
                System.out.println("You are exiting the loop");
                break;
            }

            System.out.println("How many pages are in the book?");
            int pages = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Very cool! I'll have read it. When was it published?");
            int yearPublished = scanner.nextInt();
            scanner.nextLine();

            Book book = new Book(title, pages, yearPublished);
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
