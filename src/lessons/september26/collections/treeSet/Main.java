package lessons.september26.collections.treeSet;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(1);

        System.out.println(numbers);

        numbers.add(3);
        numbers.add(3);
        numbers.add(3);

        System.out.println(numbers);
    }
}
