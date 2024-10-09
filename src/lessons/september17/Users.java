package lessons.september17;

public class Users {

    public static boolean isAdmin(User user) {
        if (user.isAdmin) {
            return true;
        } else return false;
    }

    public static void hello(User user) {
        System.out.println("Hello " + user.name);
    }

    public static boolean isValidPassword(User user) {
        if (user.password.contains("-")) {
            return false;
        }
        return true;
    }

    public static void printCredentials(User user) {
        System.out.println("User:");
        System.out.println("Name: " + user.name);
        System.out.println("Password : " + user.password);
        System.out.println("Admin: " + user.isAdmin);
    }
}
