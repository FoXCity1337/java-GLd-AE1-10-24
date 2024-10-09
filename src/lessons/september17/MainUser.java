package lessons.september17;

public class MainUser {
    public static void main(String[] args) {
        User user1 = new User();
        user1.name="Семен";
        user1.password="12345";
        user1.isAdmin=false;

        User user2 = new User();
        user2.name="Семен";
        user2.password="12345";
        user2.isAdmin=true;

        User user3 = new User();

        System.out.println(Users.isAdmin(user2));
        Users.printCredentials(user1);
        Users.printCredentials(user2);
        Users.printCredentials(user3);

    }
}
