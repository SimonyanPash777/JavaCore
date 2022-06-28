package classworks.lesson11.stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack myStack = new Stack();
        myStack.push(6);
        myStack.push(8);
        myStack.push(4);
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }
}
