package lessons.september19.dress;

public class MainDress {
    public static void main(String[] args) {
        Dress dress = new Dress(46,"Red","mini");
        System.out.println(dress.getSize());
        System.out.println(dress.getColor());
        System.out.println(dress.getLength());
        dress.setColor("Blue");
        System.out.println(dress.getSize());
        System.out.println(dress.getColor());
        System.out.println(dress.getLength());
        System.out.println(dress);
        String description = dress.toString();
        System.out.println(description);
    }
}
