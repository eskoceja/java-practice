package LibraryManagementPt2;

import javax.swing.text.html.Option;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Library {
    private List<Book> library;
    private Map<String, User> users;


    public Library() {
        library = new ArrayList<>();
        users = new HashMap<>();

    }

    //methods
    //addBook
    public void addBook(Book book) {
        library.add(book);
        System.out.println("Added to Library: \n" +
                book);
    }

    //removeBook using predicate func
    public void removeBook(String title) {
        library.removeIf(book -> book.getTitle().equals(title));
    }

    //find books by year published using predicate func
    public List<Book> findByYear(int year) {
        return library.stream().filter(book -> book.getPublicationYear() == year)
                .collect(Collectors.toList());
    }

    //find book by author using predicate func
    public List<Book> findByAuthor(String author) {
        return library.stream().filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toList());
    }

    //find book with most pages function to get max num of pages
    public Book findBookWithMostPages() {
        Optional<Book> maxPages = library.stream().max(Comparator.comparing(Book::getPages));
        return maxPages.orElse(null);
    }

    //find book with more than n pages using predicate func
    public List<Book> findByPageCount(int pageCount) {
        return library.stream().filter(book -> book.getPages()> pageCount)
                .collect(Collectors.toList());
    }

    //sortAlphabetically using function
    public List<String> sortAlphabetically() {
        List<String> sortedTitles = new ArrayList<>();
        library.forEach(book -> sortedTitles.add(book.getTitle()));
        Collections.sort(sortedTitles);
        return sortedTitles;
    }

    //find by category
    public List<Book> findByCategory(String category) {
        return library.stream().filter(book -> book.getCategory().equals(category))
                .collect(Collectors.toList());
    }

    //loaning books
    public void loanBook(String title, String libraryCardNumber) {
        Book book = findByTitle(title);
        User user = users.get(libraryCardNumber);

        if(book != null && user != null && !book.isOnLoan() && !user.reachedLoanLimit()) {
           //calculate due date in 2 weeks
            LocalDate dueDate = LocalDate.now().plusWeeks(2);

            //set that due date
            book.setDueDate(dueDate);

            book.setOnLoan(true);
            user.addBook(book);
            System.out.println("Book " + title + " has been loaned to user, " + user.getName());
        } else {
            System.out.println("Loan failed. Book unavailable or loan limit reached.");
        }

    }

    //return books
    public void returnBook(String title, String libraryCardNumber) {
        Book book = findByTitle(title);
        User user = users.get(libraryCardNumber);

        if(book !=null && user != null && book.isOnLoan() && user.hasBook(book)) {
            book.setOnLoan(false);
            user.removeBook(book);
            System.out.println( title + " successfully returned by user " + user.getName());
        } else {
            System.out.println("Return failed. Check book or user details");
        }

    }

    //find book by title
    private Book findByTitle(String title) {
        return library.stream().filter(book -> book.getTitle().equals(title))
                .findFirst().orElse(null);
    }

    //register user
    public void registerUser(User user) {
        users.put(user.getLibraryCardNumber(), user);
        System.out.println("User " + user.getName() + " registered successfully");
    }

}
