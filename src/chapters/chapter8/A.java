package chapters.chapter8;

public class A {
    int i, j;

    void showij() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B extends A {
    int k;


    void showk() {
        System.out.println("k: " + k);
    }

    void sum() {
        System.out.println("i+j+k: " + (i + j + k));
    }
}

class Bc extends A {
    int i;

    Bc(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println("Члeн i в суперклассе: " + super.i);
        System.out.println("Члeн i в подклассе: " + i);
    }
}

class As {

    int t;
    private int c;

    void settc(int x, int y) {
        t = x;
        c = y;
    }
}

class Bs extends As {

    int total;

    void sum() {
        //total = t + c;
    }
}

class UseSuper {
    public static void main(String[] args) {
        Bc subOb = new Bc(1, 2);

        subOb.show();
    }
}