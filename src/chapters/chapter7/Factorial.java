package chapters.chapter7;

public class Factorial {
    int fact(int n) {
        int result = 0;

        if (n == 1) return 1; {
            result = fact(n - 1) * n;
            return result;
        }
    }
}
