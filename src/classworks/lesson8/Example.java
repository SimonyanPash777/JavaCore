package classworks.lesson8;

public class Example {
    public static void main(String[] args) {
        int x = 200;
        int y = 14;
        int z = x * 2 > y ?  x : y ; //կրճատ տարբերակ if-ի

//        if (x > y) {
//            z = x;
//        } else {
//            z = y;
//        }
        System.out.println("z = " + z);
    }
}
