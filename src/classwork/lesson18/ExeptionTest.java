package classwork.lesson18;

import java.io.IOException;

public class ExeptionTest {

    public static void main(String[] args) {
        String number = "654";
        try {
            int a = Integer.parseInt("654q");
            System.out.println(a * 2);
        } catch (NumberFormatException e) {
            System.out.println("Please input only numbers!!");
        }

        System.out.println("Hello");
        System.out.println("Java");


        String email = "poxos@mail.com";
        try {
            checkEmail(email);
            System.out.println("Email is correct");
        } catch (IOException e) {
            System.out.println("Wrong email");
        }
        System.out.println("end of program");

    }

    static void checkEmail(String email) throws IOException {
        if (!email.contains("@mail")){
            throw new IOException();
        }
        System.out.println("Sending email...");
    }

}
