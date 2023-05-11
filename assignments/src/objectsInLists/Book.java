package objectsInLists;

public class Book {
    private String title;
    private int pages;
    private int yearPublished;
    Book(String title, int pages, int yearPublished) {
        this.title = title;
        this.pages = pages;
        this.yearPublished = yearPublished;
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
    public String toString() {
        return this.title + " has " + this.pages + " pages and was published in " + this.yearPublished;
    }
}
