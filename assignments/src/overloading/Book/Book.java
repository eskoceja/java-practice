package overloading.Book;

public class Book {
    private String title;
    private String author;
    private int pages;
    private int yearPublished;
    private double rating;
    private boolean NYTimesBestSeller;
    Book(String title, int pages, int yearPublished) {
        this.title = title;
        this.pages = pages;
        this.yearPublished = yearPublished;
    }
    Book(String title, String author, int pages, int yearPublished, double rating, boolean NYTimesBestSeller) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.yearPublished = yearPublished;
        this.rating = rating;
        this.NYTimesBestSeller = NYTimesBestSeller;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public String getAuthor() {
        return author;
    }

    public double getRating() {
        return rating;
    }

    public boolean isNYTimesBestSeller() {
        return NYTimesBestSeller;
    }

    public String toString() {
        return this.title + " was written by " + this.author + " and it consists of " + this.pages + " pages. \n" +
                "It has a rating of " + this.rating + ". Was it a New York Times Best Seller? " + this.NYTimesBestSeller;
    }
}
