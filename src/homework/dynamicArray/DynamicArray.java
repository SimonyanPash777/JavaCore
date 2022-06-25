package homework.dynamicArray;

public class DynamicArray {
    private int[] array = new int[10];
    private int size = 0; // elementneri qanak

    public void add(int value) {
        if (array.length == size) {
            extend();
        }
        array[size++] = value;
    }

    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private void extend() {
        int[] temp = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    public boolean isEmpty() {

        return array.length == 0;

    }

    public int getByIndex(int index) {

        return array[index];
    }

    int getFirstIndexByValue(int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return 0;
    }

    public void set(int index, int value) {
        if (index < size) {
            array[index] = value;
        }

    }

    public void add(int index, int value) {
        for (int i = index; i <= size; i++) {
            int temp = value;
            value = array[i];
            array[i] = temp;
        }
        size++;
    }

    public void delete(int index) {
        for (int i = index + 1; i < size; i++) {
            array[i - 1] = array[i];
        }
        size --;
    }
}
