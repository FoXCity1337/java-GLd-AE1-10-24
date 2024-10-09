package lessons.september19.user;

public class Main {
    public static void main(String[] args) {
        SuperUser superUser = new SuperUser();
        superUser.setName(null);
        String name = superUser.getName();
        System.out.println(name);
    }
}
