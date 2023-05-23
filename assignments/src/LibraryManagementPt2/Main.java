package LibraryManagementPt2;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //creating library
        Library library = new Library();

        //bringing books
        Book book1 = new Book("A Court Of Thorns And Roses", "Sarah J Maas", 2015, 419, "Fantasy");
        Book book2 = new Book("A Court Of Mist And Fury", "Sarah J Maas", 2016, 626, "Fantasy");
        Book book3 = new Book("A Court Of Wings And Ruin", "Sarah J Maas", 2017,699, "Fantasy");
        Book book4 = new Book("A Court Of Frost And Starlight", "Sarah J Maas", 2018, 299, "Fantasy");
        Book book5 = new Book("A Court Of Silver Flames","Sarah J Maas", 2021, 768, "Fantasy");
        Book book6 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 180, "Fiction");
        Book book7 = new Book("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", 2011, 443, "Non-Fiction");
        Book book8 = new Book("A Brief History of Time", "Stephen Hawking", 1988, 256, "Science");
        Book book9 = new Book("The Guns Of August", "Barbara W Tuchman", 1962, 511, "History");
        Book book10 = new Book("The Diary Of A Young Girl", "Anne Frank", 1947, 283, "Biography");

        //adding books to library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        library.addBook(book7);
        library.addBook(book8);
        library.addBook(book9);
        library.addBook(book10);

        //removing book by title
        library.removeBook("A Court Of Thorns And Roses");

        //find book by author
        List<Book> bookByAuthor = library.findByAuthor("Barbara W Tuchman");
        System.out.println("Book by Barbara W Tuchman: ");
        bookByAuthor.forEach(System.out::println);
        System.out.println();

        //find by year
        List<Book> bookByYear = library.findByYear(2011);
        System.out.println("Book published in 2011: ");
        bookByYear.forEach(System.out::println);
        System.out.println();

        //find the longest book
        Book longestBook = library.findBookWithMostPages();
        System.out.println("Book with the most pages: " + longestBook);
        System.out.println();

        //find by page count
        List<Book> bookByPageCount = library.findByPageCount(299);
        System.out.println("Books with more than 299 pages: ");
        bookByPageCount.forEach(System.out::println);
        System.out.println();

        //sort by alphabet
        List<String> sorted = library.sortAlphabetically();
        System.out.println("Books Sorted Alphabetically: ");
        sorted.forEach(System.out::println);
        System.out.println();

        //find by genre
        List<Book> byGenre = library.findByCategory("Fantasy");
        System.out.println("Books in the 'Fantasy' category: ");
        byGenre.forEach(System.out::println);
        System.out.println();

        //registering users
        User user1 = new User("Emily", "1234567");
        User user2 = new User("Blake", "37482342");

        library.registerUser(user1);
        library.registerUser(user2);

        library.loanBook("The Diary Of A Young Girl", "37482342");
        library.loanBook("A Brief History of Time", "37482342");
        library.loanBook("A Court Of Thorns And Roses", "1234567");

        library.returnBook("The Diary Of A Young Girl", "37482342");


    }
}
