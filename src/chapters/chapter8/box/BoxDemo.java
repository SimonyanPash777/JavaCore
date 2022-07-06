package chapters.chapter8.box;

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();
        Box myBox1 = new Box();
        double vol;
        myBox.width = 110;
        myBox.height = 20.1;
        myBox.depth = 5;

        myBox1.width = 33;
        myBox1.height = 600;
        myBox1.depth = 97.8;
        vol = myBox.width * myBox.height * myBox.depth;
        System.out.println("Volume myBox is -> " + vol);
        vol = myBox1.width * myBox1.height * myBox1.depth;
        System.out.println("Volume myBox1 is -> " + vol);

    }
}
