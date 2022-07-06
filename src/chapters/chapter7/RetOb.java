package chapters.chapter7;

public class RetOb {
    public static void main(String[] args) {
        Test3 ob1 = new Test3(2);
        Test3 ob2;

        ob2 = ob1.incryByTen();
        System.out.println("ob1.a " + ob1.a);
        System.out.println("ob2.a " + ob2.a);
        ob2 = ob2.incryByTen();
        System.out.println("ob 2 . a после второго увеличения значения: " + ob2.a);
    }
}
