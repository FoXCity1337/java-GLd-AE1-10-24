package lessons.september26.collections.linkedHashSet;

import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet <Integer> numbers = new LinkedHashSet<>();
        numbers.add(4);
        numbers.add(1);
        numbers.add(9);
        numbers.add(5);
        numbers.add(2);
        System.out.println(numbers);

        numbers.add(4);
        numbers.add(4);
        numbers.add(4);

        System.out.println(numbers);


    }
}
