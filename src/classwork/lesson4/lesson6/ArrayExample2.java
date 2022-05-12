package classwork.lesson4.lesson6;

public class ArrayExample2 {
    public static void main(String[] args) {
        int[] numbers = new int[1000];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = i + 1;
        }
        for (int i = 0; i< numbers.length; i++){
            System.out.println(numbers[i] + " ");
        }
        }
    }

