package home_tasks.fiveseven;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 7 == 0) {
                System.out.println("fiveseven");
            } else if (i % 5 == 0) {
                System.out.println("five");
            } else if (i % 7 == 0) {
                System.out.println("seven");
            } else {
                System.out.println(i);
            }
        }
    }
}
