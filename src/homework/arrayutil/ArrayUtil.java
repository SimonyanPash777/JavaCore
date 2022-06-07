package homework.arrayutil;

import java.util.Arrays;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {2, 6, 12, 18, 22, 3, 99, 61, 77, 1};
        System.out.println("Example 1");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\nExample 2 \n");
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        System.out.println(max);

        System.out.print("\nExample 3 \n");
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) min = array[i];
        }
        System.out.println(min);

        System.out.println("Example 4 ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                System.out.print(array[i] + " ");
        }
        int qanak = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                qanak++;

        }

        System.out.println("զույգերի քանակը հավասար է " + qanak);


        System.out.println("\nExample 5 ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0)

                System.out.println(array[i]);
        }
        int qanak1 = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] % 2 != 0)
                qanak1++;
        }
        System.out.println("կենտերի քանակը հավասար է " + qanak1);

        System.out.print("\nExample 6");
        int gumar = 0;
        for (int i = 0; i < array.length; i++) {
            gumar += array[i];
        }
        System.out.println("\nգումարը հավասար է " + gumar);
        double avg = gumar / array.length;
        System.out.println("\nբաժանում հավասար է " + avg);


    }
}
