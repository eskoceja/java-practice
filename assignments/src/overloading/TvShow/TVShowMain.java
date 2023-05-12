package overloading.TvShow;
import java.util.Scanner;
import java.util.ArrayList;

public class TVShowMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TVShow> tvShows = new ArrayList<>();
        System.out.println("TV SHOWS: \n" +
                "Entering nothing will stop the loop");

        while(true) {
            System.out.println("Name a show you like: ");
            String showName = scanner.nextLine();

            if(showName.isEmpty()) {
                System.out.println("You are exiting the loop");
                break;
            }

            System.out.println("I've heard about that show, who plays the protagonist");
            String mainCharacter = scanner.nextLine();

            System.out.println("How many episodes are in that show?");
            int episodes = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Very cool! I'll have to check it out. What genre is it?");
            String genre = scanner.nextLine();

            System.out.println("What rating does it have?");
            double rating = scanner.nextDouble();

            System.out.println("I'll definitely have to check it out now. Is it on Hulu? (yes or no)");
            String onHuluInput = scanner.nextLine();
            boolean onHulu = onHuluInput.equalsIgnoreCase("yes");
            scanner.nextLine();

            TVShow tvShow = new TVShow(showName, mainCharacter, episodes, genre, rating, onHulu);
            tvShows.add(tvShow);
        }

        for(TVShow tvShow: tvShows) {
            System.out.println(tvShow.toString());
        }

    }
}
