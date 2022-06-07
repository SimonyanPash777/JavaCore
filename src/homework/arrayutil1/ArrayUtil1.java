package homework.arrayutil1;

public class ArrayUtil1 {
    int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        return max;
    }

    int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    void pairs(int[] array) {
        System.out.print("Pairs -> ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    int numberOfPairs(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                count++;

        }
        return count;
    }

    int numberOfPoints(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0)
                count++;

        }
        return count;
    }

    int sumOfMassive(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    void divide(int[] array) {
        int sumOfMassive = sumOfMassive(array);
        double bob = sumOfMassive / array.length;
        System.out.println("The division is -> " + bob);
    }
}

