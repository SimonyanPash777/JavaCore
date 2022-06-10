package homework.braceChecker;

public class StackBC {
    private int[] array = new int[10];
    private int index;
    StackBC() {
        index = -1;
    }
    public void push(int item) {
        if (index == 9){
        }else{
            array[++index] = item;
        }
    }
    public int pop() {
        if (index < 0){
            return 0;
        }else {
            return array[index--];
        }
    }
}
