package lessons.september19.tvset;

public class TvSet {
    private String brand;
    private double price;
    private int screenSize;

    public TvSet(String brand, double price, int screenSize) {
        this.brand = brand;
        this.price = price;
        this.screenSize = screenSize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "TvSet{" +
                "brand='" + getBrand() + '\'' +
                ", price=" + getPrice() +
                ", screenSize=" + getScreenSize() +
                '}';
    }
}
