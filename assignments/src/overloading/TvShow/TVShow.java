package overloading.TvShow;

public class TVShow {
    private String showName;
    private String mainCharacter;
    private int episodes;
    private String genre;
    private double rating;
    private boolean onHulu;

    TVShow(String showName, int episodes, String genre) {
        this.showName = showName;
        this.episodes = episodes;
        this.genre = genre;
    }
    TVShow(String showName, String mainCharacter, int episodes, String genre, double rating, boolean onHulu) {
        this.showName = showName;
        this.mainCharacter = mainCharacter;
        this.episodes = episodes;
        this.genre = genre;
        this.rating = rating;
        this.onHulu = onHulu;
    }

    public String getShowName() {
        return showName;
    }

    public int getEpisodes() {
        return episodes;
    }

    public String getGenre() {
        return genre;
    }

    public String getMainCharacter() {
        return mainCharacter;
    }

    public double getRating() {
        return rating;
    }

    public boolean isOnHulu() {
        return onHulu;
    }

    public String toString() {
        return "The name of the show is " + this.showName + " with " + this.episodes + " episodes. The genre is " + this.genre + ". \n" +
                this.mainCharacter + " plays the protagonist. The show has a rating of " + this.rating + ". \n" +
                "It is available on Hulu: " + this.onHulu;
    }
}
