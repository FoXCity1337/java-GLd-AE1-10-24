package lessons.september26.collections.hashSet;

import java.util.HashSet;

public class MainA {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println(numbers);

        numbers.add(3);
        numbers.add(3);
        numbers.add(3);
        System.out.println(numbers);

    }
}
