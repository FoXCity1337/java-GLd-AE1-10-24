package lessons.september26.collections.arrayLists;

import java.util.ArrayList;

public class MainC {
    public static void main(String[] args) {
        ArrayList<Manager> managers = new ArrayList<>();
        managers.add(new Manager("Семен",1000));
        managers.add(new Manager("Елизавета",2000));
        managers.add(new Manager("Артур",1500));

        System.out.println(managers.get(3));
    }
}
