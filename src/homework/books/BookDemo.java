package homework.books;

import homework.books.model.Author;
import homework.books.model.Book;
import homework.books.storage.AuthorStorage;
import homework.books.storage.BookStorage;

import java.io.IOException;
import java.util.Scanner;

import static homework.books.commands.Commands.*;

public class BookDemo {

    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();
    private static AuthorStorage authorStorage = new AuthorStorage();

    public static void main(String[] args) throws IOException {
        bookStorage.add(new Book("abu lala mahari", 750, 145, "Joxovacu"));
        bookStorage.add(new Book("xenty", 8500, 14, "Joxovacu"));
        bookStorage.add(new Book("verq hayastani", 9500, 15, "Joxovacu"));
        bookStorage.add(new Book("hayoc lezu", 5500, 45, "Joxovacu"));
        authorStorage.add(new Author("", "avetiq", "isahakyan", "poem@mail.ru", "male"));
        authorStorage.add(new Author("", "raffi", "raffi", "vep1@mail.ru", "male"));
        authorStorage.add(new Author("", "xachatur", "abovyan", "vep2@mail.ru", "male"));
        authorStorage.add(new Author("", "silva", "kaputikyan", "banastexcutyun@mail.ru", "female"));


        boolean run = true;
        while (run) {
            System.out.println("please input " + EXIT + " for exit");
            System.out.println("please input " + ADD_BOOK + " for add book");
            System.out.println("please input " + PRINT_ALL_BOOKS + " for print all books");
            System.out.println("please input " + PRINT_ALL_AUTHORS + " for print all authors");
            System.out.println("please input " + PRINT_BOOKS_AUTHOR_NAME + " for print Books by authorName");
            System.out.println("please input " + PRINT_BOOKS_AUTHOR_SURNAME + " for print Books by authorSurname");
            System.out.println("please input " + PRINT_BOOKS_BY_AUTHOR_EMAIL + " for print Books by authorEmail");
            System.out.println("please input " + PRINT_BOOKS_BY_AUTHOR_GENDER + " for print Books by authorGender");
            System.out.println("please input " + PRINT_BOOKS_BY_GENRE + " for print Books by genre");
            System.out.println("please input " + PRINT_BOOKS_BY_PRICE_RANGE + " for print books by price range");

            int command = Integer.parseInt(scanner.nextLine());

            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_ALL_BOOKS:
                    bookStorage.printAllBooks();
                    break;

                case PRINT_ALL_AUTHORS:
                    authorStorage.printAllAuthors();
                    break;

                case PRINT_BOOKS_AUTHOR_NAME:
                    printBooksByAuthorName();
                    break;

                case PRINT_BOOKS_AUTHOR_SURNAME:
                    printBooksByAuthorSurname();
                    break;

                case PRINT_BOOKS_BY_AUTHOR_EMAIL:
                    printBooksByAuthorEmail();
                    break;

                case PRINT_BOOKS_BY_AUTHOR_GENDER:
                    printBooksByGenere();
                    break;
                case PRINT_BOOKS_BY_GENRE:
                    printBooksByGenere();
                    break;

                case PRINT_BOOKS_BY_PRICE_RANGE:
                    printBooksByPriceRange();
                    break;

                default:
                    System.err.println("Invalid command");
            }
        }
    }

    private static void printBooksByAuthorName() {
        System.out.println("Please input author name");
        String authorName = scanner.nextLine();
        authorStorage.printBooksByAuthorName(authorName);
    }

    private static void printBooksByAuthorSurname() {
        System.out.println("Please input author surname");
        String surname = scanner.nextLine();
        authorStorage.printBooksByAuthorSurname(surname);
    }

    private static void printBooksByAuthorEmail() throws IOException {
        System.out.println("Please input author email");
        String email = scanner.nextLine();
        authorStorage.printBooksByAuthorEmail(email);
    }

    private static void printBooksByAuthorGender() {
        System.out.println("Pleace input MALE or FEMALE");
        String male = scanner.nextLine();
        String female = scanner.nextLine();
        authorStorage.printBooksByAuthorGender(male, female);
    }

    private static void printBooksByGenere() {
        System.out.println("Please input genere");
        String genre = scanner.nextLine();
        bookStorage.printBooksByGenre(genre);
    }

    private static void printBooksByPriceRange() {
        System.out.println("Pleace input min price");
        int min = Integer.parseInt(scanner.nextLine());
        System.out.println("Pleace input max price");
        int max = Integer.parseInt(scanner.nextLine());
        bookStorage.printBooksByPriceRange(min, max);
    }

    private static void addBook() {
        System.out.println("Please input books title");
        String title = scanner.nextLine();
        System.out.println("Please input author name");
        String authorName = scanner.nextLine();
        System.out.println("Please input author surname");
        String authorSurname = scanner.nextLine();
        System.out.println("Pleace input author email");
        String email = scanner.nextLine();
        if (!email.contains("@")) {
            System.out.println("Wrong email");
            System.out.println("Please input correct email");
        } else {
            System.out.println("Pleace input author gender male or female");
            String gender = scanner.nextLine();
            System.out.println("Please input price ");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.println("Please input count");
            String countStr = scanner.nextLine();
            System.out.println("Please input genre");
            String genre = scanner.nextLine();

            int count = Integer.parseInt(countStr);
            Author author = new Author(title, authorName, authorSurname, email, gender);
            Book book = new Book(title, price, count, genre);
            bookStorage.add(book);
        }
    }

}
