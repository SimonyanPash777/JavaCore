package chapters.chapters8.box;

public class BoxWeigthDemo {
    public static void main(String[] args) {
        BoxWeigth myBox1 = new BoxWeigth(10,20,15,34.3);
        BoxWeigth myBox2 = new BoxWeigth(2,3,4,0.076);
        double vol;

        vol = myBox1.volume();
        System.out.println("Oбъeм myboxl равен " + vol);
        System.out.println("Bec myboxl равен " + myBox1.weigth);
        System.out.println();

        vol = myBox2.volume();
        System.out.println("Oбъeм mybox2 равен " + vol);
        System.out.println("Bec mybox2 равен " + myBox2.weigth);
    }
}
