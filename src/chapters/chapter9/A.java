package chapters.chapter9;

public class A {
    public interface NestedIf {
        boolean isNotNegative(int x);
    }
}

class B implements A.NestedIf {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}
