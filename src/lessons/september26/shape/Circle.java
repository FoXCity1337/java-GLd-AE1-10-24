package lessons.september26.shape;

public class Circle extends TwoDShape {
    double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double area(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", name='" + name + '\'' +
                "} ";
    }
}
