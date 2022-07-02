package classwork.lesson14.example;

public class StringExample {

    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < 1001; i++) {
            result.append("poxos");
            result.append(i);
            result.append(" ");
        }

        System.out.println(result);
    }
}
