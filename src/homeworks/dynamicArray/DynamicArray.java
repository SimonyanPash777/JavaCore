package homeworks.dynamicArray;

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

        return size == 0;

    }

    public int getByIndex(int index) {

        return array[index];
    }

    int getFirstIndexByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public void set(int index, int value) {
        if (index >= 0 && index < size) {
            array[index] = value;
        }

    }

    public void add(int index, int value) {
        if (array.length == size) {
            extend();
            for (int i = size; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = value;
            size++;
        }
    }


    public void delete(int index) {
        if (array.length == size) {
            extend();
            for (int i = index + 1; i < size; i++) {
                array[i - 1] = array[i];
            }
            size--;
        }
    }
}
