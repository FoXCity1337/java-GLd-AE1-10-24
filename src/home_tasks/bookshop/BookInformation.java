package home_tasks.bookshop;

public class BookInformation {
    private int id;
    private String name;
    private String author;
    private String publishing;
    private int publishingYear;
    private int pageQuantity;
    private int price;
    private String coverType;


    public BookInformation(int id, String name, String author, String publishing, int publishingYear,
                           int pageQuantity, int price, String coverType) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publishing = publishing;
        this.publishingYear = publishingYear;
        this.pageQuantity = pageQuantity;
        this.price = price;
        this.coverType = coverType;
    }

    public BookInformation(int id, String name, int price, int pageQuantity, String publishing, String author,
                           int publishingYear) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.pageQuantity = pageQuantity;
        this.publishing = publishing;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public BookInformation(int id, String name, String author, int pageQuantity, int publishingYear, String publishing) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.pageQuantity = pageQuantity;
        this.publishingYear = publishingYear;
        this.publishing = publishing;

    }

    public BookInformation(int id, String name, String author, int price, String publishing) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
        this.publishing = publishing;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public int getPageQuantity() {
        return pageQuantity;
    }

    public void setPageQuantity(int pageQuantity) {
        this.pageQuantity = pageQuantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    @Override
    public String toString() {
        return "BookInformation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publishing='" + publishing + '\'' +
                ", publishingYear='" + publishingYear + '\'' +
                ", pageQuantity=" + pageQuantity +
                ", price=" + price +
                ", coverType='" + coverType + '\'' +
                '}';
    }
}
