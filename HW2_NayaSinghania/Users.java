import java.util.ArrayList;
import java.util.List;

public class Users {
    private static List<User> users = new ArrayList<>();

    public static void addUser(User user) {
        users.add(user);
    }

    public static User getUser(String username) {

        for (User u : users) {
            if (u.getUsername().equals(username)) {
                return u;
            }
        }
        
        return null;
    }
}
