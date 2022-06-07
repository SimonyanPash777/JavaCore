package chapters.chapters7.boxOverLoad;

import chapters.chapters7.boxOverLoad.Overload;

public class OverLoadDemo {
    public static void main(String[] args) {
        Overload myOverLoad = new Overload();
        double result;
        myOverLoad.test();
        myOverLoad.test(10);
        myOverLoad.test(10,20);
        result = myOverLoad.test(123.25);
        System.out.println("Peзyльтaт вызова myOverLoad.test(123.25}:" + result);
    }
}
