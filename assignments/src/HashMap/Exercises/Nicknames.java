package HashMap.Exercises;
import java.util.HashMap;

public class Nicknames {
    public static void main(String[] args) {
        HashMap<String, String> nicknameMap = new HashMap<>();

        // Storing names and nicknames in the HashMap
        nicknameMap.put("matthew", "matt");
        nicknameMap.put("michael", "mix");
        nicknameMap.put("arthur", "artie");

        // Retrieving Matthew's nickname from the HashMap
        String matthewNickname = nicknameMap.get("matthew");

        // Printing Matthew's nickname
        System.out.println("Matthew's nickname: " + matthewNickname);
    }
}
