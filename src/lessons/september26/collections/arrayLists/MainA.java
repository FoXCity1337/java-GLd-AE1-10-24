package lessons.september26.collections.arrayLists;

import java.util.ArrayList;
import java.util.HashSet;

public class MainA {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println(arrayList);

        HashSet<Integer> set = new HashSet<>();

        set.addAll(arrayList);

        System.out.println(set.size() == arrayList.size());
    }
}
