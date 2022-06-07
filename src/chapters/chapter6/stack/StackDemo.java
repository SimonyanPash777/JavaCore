package chapters.chapter6.stack;

import chapters.chapter6.stack.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack myStack1 = new Stack();
        Stack myStack2 = new Stack();
        for (int i = 0; i < 10; i++) myStack1.push(i);
        {
            System.out.println("Coдepжимoe стека mystackl:");
            for (int i = 0; i < 10; i++) {
                System.out.println(myStack1.pop());
            }
        }
        for (int i = 10; i < 20; i++) myStack2.push(i);
        {
            System.out.println("Coдepжимoe стека mystack2:");
            for (int i = 0; i < 10; i++) {
                System.out.println(myStack2.pop());
            }
        }
    }
}
