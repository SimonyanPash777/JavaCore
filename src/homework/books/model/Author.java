package homework.books.model;

public class Author {

    private  String title;
    private String authorName;
    private String authorSurName;
    private String email;
    private String gender;

    public Author() {

    }

    public Author(String title, String authorName, String authorSurName, String email, String gender) {
        this.title = title;
        this.authorName = authorName;
        this.authorSurName = authorSurName;
        this.email = email;
        this.gender = gender;
    }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public String getName() { return authorName; }

    public void setName(String name) { this.authorName = name; }

    public String getSurName() { return authorSurName; }

    public void setSurName(String surName) { this.authorSurName = surName; }

    public String getEmail() { return email; }

    public void setEmail(String mail) { this.email = mail; }

    public String getGender() { return gender; }

    public void setGender(String gander) { this.gender = gender; }

    @Override
    public String toString() {
        return "Author{" +
                "authorName='" + authorName + '\'' +
                ", authorSurName='" + authorSurName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
