//Q4. Create “UserManager” class with list of following users:

import java.util.*;

public class UserManagerDAOImpl implements UserManagerDAO {

    private LinkedList<User> userList =new LinkedList<>();

 public UserManagerDAOImpl(){
     userList.add(new User("Ashish","pass@12245","Admin","True"));
     userList.add(new User("Anish","My$pass123","User","True"));
     userList.add(new User("Alok","$$xyz$$12345","User","True"));
     userList.add(new User("Aditi","Opps_forgot_1","Userge :","True"));

 }
    @Override
    public void add(User u) {
        userList.add(u);
    }


    @Override
    public List<User> find(String name) {
        List<User> temp = new ArrayList<>();
        for (User e : userList) {
            if ( e.getUsername().toLowerCase().contains(name.toLowerCase()) ) {
                temp.add(e);
            }
        }
        return temp;
    }

    @Override
    public List<User> getAll() {
        return userList;
    }
}
