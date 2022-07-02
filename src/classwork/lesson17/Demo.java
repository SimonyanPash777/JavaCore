package classwork.lesson17;

public class Demo {
    public static void main(String[] args) {

        A a = new A();

        B b = new B();

//        a.printKuKu();
//        b.printKuKu();

        printKuKu5Times(a);
    }


    static void printKuKu5Times(ShowKuKu o){
        for (int i = 0; i < 5; i++) {
            o.printKuKu();
        }
    }
}
