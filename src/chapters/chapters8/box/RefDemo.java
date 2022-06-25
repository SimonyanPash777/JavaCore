package chapters.chapters8.box;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeigth weigthBox = new BoxWeigth(3,5,7,8.37);
        Box plainBox = new Box();
        double vol;

        vol = weigthBox.volume();
        System.out.println("Oбъeм weightBox равен " + vol);
        System.out.println("Bec weightBox равен " + weigthBox.weigth);
        System.out.println();

        plainBox = weigthBox;
        vol = plainBox.volume();
        System.out.println("Oбъeм plainBox равен " + vol);
    }
}
