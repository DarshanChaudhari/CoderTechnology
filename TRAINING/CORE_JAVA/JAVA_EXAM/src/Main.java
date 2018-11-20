
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        UserManagerDAOImpl userManagerImpl = new UserManagerDAOImpl();
        String name;
        String password;
        String role;
        String Active;
        User e;

        List<User> listUser ;
        for (int i = 0; i < 4; i++) {
            userManagerImpl.add(getUserDetails());
        }

        // Display list of books based on author name provided
        System.out.println("Please enter name to search : ");
        name = scan.next();
        listUser = userManagerImpl.find(name);
        for (User u : listUser) {
            System.out.println(u);
        }
    }


    public static User getUserDetails() throws Exception {
        String name;
        String password;
        String role;
        String Active;
        User u;
            System.out.println("Please enter User Name: ");
            name = scan.nextLine();
            CheckException.validateUsername(name);
            System.out.println("Please enter password: ");
            password = scan.next();
            CheckException.validatePassword(password);
            System.out.println("Please enter Role: ");
            role = scan.next();
            System.out.println("Please enter the status ");
            Active = scan.next();


            u = new User(name, password, role, Active);
            return u;
        }


    public static void getAll(UserManagerDAOImpl userManagerImpl) {
        List<User> listUser = userManagerImpl.getAll();
        for (User u : listUser) {
            System.out.println(u);
        }
    }
}
