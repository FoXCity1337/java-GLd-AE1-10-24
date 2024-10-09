package lessons.september26.collections.treeSet;

import java.util.ArrayList;

public class MainB {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println(arrayList);
        arrayList.add(3);
        arrayList.add(3);
        System.out.println(arrayList);
    }
}
