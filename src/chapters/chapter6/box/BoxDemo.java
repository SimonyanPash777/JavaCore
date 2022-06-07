package chapters.chapter6.box;

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();
        Box myBox1 = new Box();
        double vol;
        myBox.width = 110;
        myBox.higth = 20.1;
        myBox.debth = 5;

        myBox1.width = 33;
        myBox1.higth = 600;
        myBox1.debth = 97.8;
        vol = myBox.width * myBox.higth * myBox.debth;
        System.out.println("Volume myBox is -> " + vol);
        vol = myBox1.width * myBox1.higth * myBox1.debth;
        System.out.println("Volume myBox1 is -> " + vol);

    }
}
