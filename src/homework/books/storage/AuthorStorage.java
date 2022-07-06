package homework.books.storage;

import homework.books.exception.AuthorNotFoundException;
import homework.books.model.Author;

import java.io.IOException;

public class AuthorStorage {

    private Author[] array = new Author[10];
    private int size = -1;

    public void add(Author author) {
        if (size == array.length) {
            extend();
        }
        array[++size] = author;
    }


    public void printAllAuthors() {
        for (int i = 0; i < size + 1; i++) {
            System.out.println(array[i].getName() + " " + array[i].getSurName());
        }
    }


    private void extend() {
        if (size == array.length) {
            Author[] temp = new Author[array.length + 10];
            for (int i = 0; i < size; i++) {
                temp[i] = array[i];
            }
            array = temp;
        }
    }

    public void printBooksByAuthorName(String authorName) {
        for (int i = 0; i <= size; i++) {
            if (array[i].getName().equals(authorName)) {
                System.out.println(array[i]);
            }
        }
    }

    public void printBooksByAuthorSurname(String autorSurname) {
        for (int i = 0; i <= size; i++) {
            if (array[i].getSurName().equals(autorSurname)) {
                System.out.println(array[i]);
            }
        }
    }

    public void printBooksByAuthorEmail(String email) throws IOException {
        for (int i = 0; i <= size; i++) {
            if (array[i].getEmail().equals(email)) {
                System.out.println(array[i] + " " + array[i].getName() + " " + array[i].getSurName());
            }
        }
    }

    public void printBooksByAuthorGender(String male, String female) {
        for (int i = 0; i <= size; i++) {
            if (array[i].getGender().equals(male) || array[i].getGender().equals(female)) {
                System.out.println(array[i]);
            }
        }
    }

    public int getSize() {
        return size;
    }

    public Author getAuthorByIndex(int index) throws AuthorNotFoundException{
        if (index < 0 || index >= size) {
            throw new  AuthorNotFoundException("There is no Author at" + index + "index");
        }
        return array[index];
    }

}
