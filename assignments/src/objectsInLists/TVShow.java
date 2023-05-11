package objectsInLists;

public class TVShow {
    private String showName;
    private int episodes;
    private String genre;

    TVShow(String showName, int episodes, String genre) {
        this.showName = showName;
        this.episodes = episodes;
        this.genre = genre;
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
    public String toString() {
        return "The name of the show is " + this.showName + " with " + this.episodes + " number of episodes. The genre is " + this.genre;
    }
}
