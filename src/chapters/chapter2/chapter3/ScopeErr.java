package chapters.chapter2.chapter3;

public class ScopeErr {
    public static void main(String[] args) {
        int bar = 1;
        {
            int baar = 2;
        }
    }
}
