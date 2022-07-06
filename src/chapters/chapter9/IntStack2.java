package chapters.chapter9;

public interface IntStack2 {

    void push(int item);
    int pop();

    default void clear() {
        System.out.println("Meтoд clear() не реализован.");
    }

}
