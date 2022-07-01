package homework.braceChecker;

public class BraceCheckerDemo {
    public static void main(String[] args) {
        String text = ("Hello {From (jnnkk [knasln {uhuh (Java}");
        BraceChecker braceChecker = new BraceChecker(text);
        braceChecker.check();
    }
}
