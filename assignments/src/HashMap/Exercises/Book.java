package HashMap.Exercises;

public class Book {
    private String name;
    private String content;
    private int published;

    public Book(String name, int published, String content) {
        this.name = name;
        this.published = published;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public int getPublished() {
        return published;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setPublished(int published) {
        this.published = published;
    }

    public String toString() {
        return "Name: " + this.name + "(" + this.published + ") \n" +
                "Content: " + this.content;
    }

}
