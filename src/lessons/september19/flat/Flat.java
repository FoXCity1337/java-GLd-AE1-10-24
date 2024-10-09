package lessons.september19.flat;

public class Flat {
    private double square;
    private double height;

    public Flat(double square, double height) {
        setSquare(square);
        setHeight(height);
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        if (square < 0) {
            this.square = 0;
        } else {
            this.square = square;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    @Override
    public String toString() {
        return "Flat{" +
                "square=" + getSquare() +
                ", height=" + getHeight() +
                '}';
    }
}
