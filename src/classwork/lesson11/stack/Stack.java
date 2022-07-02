package classwork.lesson11.stack;

public class Stack {
    int[] array = new int[10];
    int index;

    Stack() {

        index = -1;
    }

    void push(int value) {
        if (index == 9) {
            System.out.println("Stack is empty");
        }else {
            array[++index] = value;
        }
    }

    int pop() {
        if (index < 0) {
            System.err.println("Stack is empty");
            return 0;
        }
        return array[index--];
    }

}
