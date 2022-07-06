package homework.books;

import homework.books.commands.Commands;
import homework.books.exception.AuthorNotFoundException;
import homework.books.model.Author;
import homework.books.model.Book;
import homework.books.storage.AuthorStorage;
import homework.books.storage.BookStorage;

import java.io.IOException;
import java.util.Scanner;


public class BookDemo implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();
    private static AuthorStorage authorStorage = new AuthorStorage();
    private static Author author = new Author();

    public static void main(String[] args) throws IOException {
        bookStorage.add(new Book("abu lala mahari", 750, 145, "Joxovacu"));
        bookStorage.add(new Book("xenty", 8500, 14, "Joxovacu"));
        bookStorage.add(new Book("verq hayastani", 9500, 15, "Joxovacu"));
        bookStorage.add(new Book("hayoc lezu", 5500, 45, "Joxovacu"));
        authorStorage.add(new Author("avetiq", "isahakyan", "poem@mail.ru", "male"));
        authorStorage.add(new Author("raffi", "raffi", "vep1@mail.ru", "male"));
        authorStorage.add(new Author("xachatur", "abovyan", "vep2@mail.ru", "male"));
        authorStorage.add(new Author("silva", "kaputikyan", "banastexcutyun@mail.ru", "female"));


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
                    printBooksByAuthorGender();
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

    private static String printBooksByAuthorGender() {
        System.out.println("Pleace input 1 for male");
        System.out.println("Pleace input 2 for female");
        int index = Integer.parseInt(scanner.nextLine());
        if (index != 1 && index != 2) {
            System.err.println("Please input correct gender");
            printBooksByAuthorGender();
        } else if (index == 1) {
            author.setGender("male");
        } else {
            author.setGender("female");
        }
        return author.getGender();
    }

    private static void printBooksByGenere() {
        System.out.println("Please input genere");
        String genre = scanner.nextLine();
        bookStorage.printBooksByGenre(genre);
    }

    private static void printBooksByPriceRange() {
        System.out.println("Pleace input min price");
        try {
            int min = Integer.parseInt(scanner.nextLine());
            System.out.println("Pleace input max price");
            int max = Integer.parseInt(scanner.nextLine());
            bookStorage.printBooksByPriceRange(min, max);
        } catch (NumberFormatException e) {
            System.err.println("Your price range not found in books");
            System.out.println("Please input price range");
            printBooksByPriceRange();
        }
    }

    private static void addBook() {

        if (authorStorage.getSize() != 0) {
            authorStorage.printAllAuthors();
            System.out.println("Please input index");
            Author author1 = null;
            try {

                int authorIndex = Integer.parseInt(scanner.nextLine());
                author = authorStorage.getAuthorByIndex(authorIndex);
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
                    String gender = printBooksByAuthorGender();
                }
                String gender = scanner.nextLine();
                Author author = new Author(authorName, authorSurname, email, gender);
            } catch (AuthorNotFoundException | NumberFormatException e) {
                System.out.println("Please input correct index");
                addBook();
            }
        }

        System.out.println("Please input price ");
        try {

            double price = Double.parseDouble(scanner.nextLine());

            System.out.println("Please input books title");
            String title = scanner.nextLine();
            System.out.println("Please input count");
            String countStr = scanner.nextLine();
            System.out.println("Please input genre");
            String genre = scanner.nextLine();

            int count = Integer.parseInt(countStr);

            Book book = new Book(title, price, count, genre);
            bookStorage.add(book);
        } catch (NumberFormatException e) {
            System.out.println("Please choose corect price");
            printBooksByPriceRange();
        }
    }
}


