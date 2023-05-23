package LibraryManagementPt2;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String libraryCardNumber;
    private List<Book> onLoan;
    private double lateFee;

    public User(String name, String libraryCardNumber) {
        this.name = name;
        this.libraryCardNumber = libraryCardNumber;
        this.onLoan = new ArrayList<>();
        this.lateFee = 0.0;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public String getLibraryCardNumber() {
        return libraryCardNumber;
    }

    public List<Book> getOnLoan() {
        return onLoan;
    }

    public double getLateFee() {
        return lateFee;
    }

    //loaning
    public void addBook(Book book) {
        onLoan.add(book);
    }
    public void removeBook(Book book) {
        onLoan.remove(book);
    }
    public boolean hasBook(Book book) {
        return onLoan.contains(book);
    }
    public boolean reachedLoanLimit() {
        return onLoan.size() >= 3;
    }

    //late fees
    public void accrueLateFee(double fee) {
        lateFee += fee;
    }

}
