package homework.books;

import java.io.IOException;
import java.util.Scanner;

import static homework.books.Commands.*;

public class BookDemo {

    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();

    public static void main(String[] args) throws IOException {
        bookStorage.add(new Book("Mtnadzor", "Aksel", "Bakunc", "joxovacu@mail.ru",
                                 "male", 7500, 145, "Joxovacu"));

        bookStorage.add(new Book("Abu Lala Mahari", "Avetiq", "Isahakyan",  "poem@mail.ru",
                                 "male", 6800, 57, "Poem"));

        bookStorage.add(new Book("Xenty","Raffi", "",  "vep1@mail.ru",
                                 "male", 8800, 49, "Vep"));

        bookStorage.add(new Book("Verq Hayastani","Xachatur",  "Abovyan","vep2@mail.ru",
                                 "male", 9990, 103, "Vep"));

        bookStorage.add(new Book("Hayoc Lezu","Silva",  "Kaputikyan","banastexcutyunn@mail.ru",
                                 "female", 9790, 13, "Banastexcutyun"));

        boolean run = true;
        while (run) {
            System.out.println("please input " + EXIT + " for exit");
            System.out.println("please input " + ADD_BOOK + " for add book");
            System.out.println("please input " + PRINT_ALL_BOOKS + " for print all books");
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
                case PRINT_BOOKS_AUTHOR_NAME:
                    System.out.println("Please input author name");
                    String authorName = scanner.nextLine();
                    bookStorage.printBooksByAuthorName(authorName);
                    break;
                case PRINT_BOOKS_AUTHOR_SURNAME:
                    System.out.println("Please input author surname");
                    String surname = scanner.nextLine();
                    bookStorage.printBooksByAuthorSurname(surname);
                    break;
                case PRINT_BOOKS_BY_AUTHOR_EMAIL:
                    System.out.println("Please input author email");
                    String email = scanner.nextLine();
                    bookStorage.printBooksByAuthorEmail(email);
                    break;
                case PRINT_BOOKS_BY_AUTHOR_GENDER:
                    System.out.println("Pleace input MALE or FEMALE");
                    String male = scanner.nextLine();
                    String female = scanner.nextLine();
                    bookStorage.printBooksByAuthorGender(male,female);
                case PRINT_BOOKS_BY_GENRE:
                    System.out.println("Please input genere");
                    String genre = scanner.nextLine();
                    bookStorage.printBooksByGenre(genre);
                    break;
                case PRINT_BOOKS_BY_PRICE_RANGE:
                    System.out.println("Pleace input min price");
                    String minStr = scanner.nextLine();
                    System.out.println("Pleace input max price");
                    String maxStr = scanner.nextLine();
                    int min = Integer.parseInt(minStr);
                    int max = Integer.parseInt(maxStr);
                    bookStorage.printBooksByPriceRange(min,max);
                    break;

                default:
                    System.err.println("Invalid command");
            }
        }
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
        if (!email.contains("@")){
            System.out.println("Wrong email");
            System.out.println("Please input correct email");
        }else {
            System.out.println("Pleace input author gender male or female");
            String gender = scanner.nextLine();
            System.out.println("Please input price ");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.println("Please input count");
            String countStr = scanner.nextLine();
            System.out.println("Please input genre");
            String genre = scanner.nextLine();

            int count = Integer.parseInt(countStr);
            Book book = new Book(title, authorName, authorSurname, email, gender, price, count, genre);
            bookStorage.add(book);
        }
    }

}
