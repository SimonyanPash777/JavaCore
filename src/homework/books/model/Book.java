package homework.books.model;

public class Book {


    private String title;
    private double price;
    private int count;
    private String genre;

    public Book(String title, double price, int count, String genre) {
        this.title = title;
        this.price = price;
        this.count = count;
        this.genre = genre;
    }

    public Book() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    @Override
    public String toString() {
        return "Book{" +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", genre='" + genre + '\'' +
                '}';
    }
}