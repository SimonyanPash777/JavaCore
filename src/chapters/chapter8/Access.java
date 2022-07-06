package chapters.chapter8;

public class Access {
    public static void main(String[] args) {
        Bs subOb = new Bs();

        subOb.settc(10,12);

        subOb.sum();
        System.out.println("Sum equals " + subOb.total);
    }
}
