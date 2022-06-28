package homeworks.books;

import java.util.Scanner;

import static homeworks.books.Commands.*;

public class BookDemo {

    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();

    public static void main(String[] args) {
        bookStorage.add(new Book("Mtnadzor", "Aksel Bakunc", 7500, 145, "Joxovacu"));
        bookStorage.add(new Book("Abu Lala Mahari", "Avetiq Isahakyan", 6800, 57, "Poem"));
        bookStorage.add(new Book("Xenty", "Raffi", 8800, 49, "Vep"));
        bookStorage.add(new Book("Verq Hayastani", "Xachatur Abovyan", 9990, 103, "Vep"));

        boolean run = true;
        while (run) {
            System.out.println("please input " + EXIT + " for exit");
            System.out.println("please input " + ADD_BOOK + " for add book");
            System.out.println("please input " + PRINT_ALL_BOOKS + " for print all books");
            System.out.println("please input " + PRINT_BOOKS_AUTHOR_NAME + " for print Books by AuthorName");
            System.out.println("please input " + PRINT_BOOKS_BY_GENRE + " for print Books by Genre");
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
                    String authorName = scanner.nextLine();
                    bookStorage.printBooksByAuthorName(authorName);
                    break;
                case PRINT_BOOKS_BY_GENRE:
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
        System.out.println("Please input price ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Please input count");
        String countStr = scanner.nextLine();
        System.out.println("Please input genre");
        String genre = scanner.nextLine();

        int count = Integer.parseInt(countStr);
        Book book = new Book(title, authorName, price, count, genre);
        bookStorage.add(book);
    }

}
