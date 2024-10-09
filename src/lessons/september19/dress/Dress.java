package lessons.september19.dress;

public class Dress {
    private int size;
    private String Color;
    private String length;

    public Dress(int size, String color, String length) {
        this.size = size;
        Color = color;
        this.length = length;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Dress{" +
                "size=" + size +
                ", Color='" + Color + '\'' +
                ", length='" + length + '\'' +
                '}';
    }
}
