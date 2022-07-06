package chapters.chapter9;

public class FixedStack implements IntStack {

    private int stck[];
    private int tos;

    public FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    public void push(int item) {
        if (tos == stck.length - 1) {
            System.out.println("STACK FULL");
        } else {
            stck[++tos] = item;
        }
    }

    public int pop() {
        if (tos < 0) {
            System.out.println("Stack is empty");
            return 0;
        } else return stck[tos--];
    }
}
