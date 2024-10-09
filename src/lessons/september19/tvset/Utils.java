package lessons.september19.tvset;

public class Utils {
    public static int generateTvSize(int max, int min) { //30-54
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static int generateTvSize() {
        return (generateTvSize(30, 54));
    }

    public static String generateBrand() {
        String [] array = {"Samsung","Xiaomi", "LG"};
        int i = (int) ((Math.random() * array.length));
        return array[i];
    }
}
