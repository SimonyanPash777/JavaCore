package chapters.chapters7.box;

public class BoxOverLoadDemo {
    public static void main(String[] args) {
        BoxOverLoad myBox1 = new BoxOverLoad(10, 20, 25);
        BoxOverLoad myBox2 = new BoxOverLoad();
        BoxOverLoad myCube = new BoxOverLoad(7);
        BoxOverLoad myClone = new BoxOverLoad(myBox1);
        double vol;
        vol = myBox1.volume();
        System.out.println("Oбъeм myboxl равен " + vol);
        vol = myBox2.volume();
        System.out.println("Oбъeм mybox2 равен " + vol);
        vol = myCube.volume();
        System.out.println("Oбъeм куба равен " + vol);
        vol = myClone.volume();
        System.out.println("Oбъeм клона равен " + vol);


    }
}
