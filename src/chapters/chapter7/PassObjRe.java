package chapters.chapter7;

public class PassObjRe {
    public static void main(String[] args) {
        Test2 ob = new Test2(15,20);
        System.out.println("ob.a и оb.b до вызова: " + ob.a + " " + ob.b);
        ob.meth(ob);
        System.out.println("ob.a и оb.b после вызова: " + ob.a + " " + ob.b);
    }
}
