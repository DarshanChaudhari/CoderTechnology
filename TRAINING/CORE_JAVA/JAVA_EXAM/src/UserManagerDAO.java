// Q4. Create “UserManager” class with list of following users:
import java.util.List;

public interface UserManagerDAO {
    void add(User u);
    List<User> find(String name);
    List<User> getAll();
}

