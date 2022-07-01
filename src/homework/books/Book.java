package homework.books;

public class Book {

    private String name;
    private String surname;
    private String email;
    private String gender;
    private String title;
    private double price;
    private int count;
    private String genre;

    public Book(String title, String authorName, String authorSurname, String email, String gender, double price, int count, String genre) {
        this.title = title;
        this.name = authorName;
        this.surname = authorSurname;
        this.email = email;
        this.gender = gender;
        this.price = price;
        this.count = count;
        this.genre = genre;
    }

    public Book() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", genre='" + genre + '\'' +
                '}';
    }
}