package chapters.chapter9.p1;

public class OtherPackage {
    public OtherPackage() {
        Protection p = new Protection();
        System.out.println("кoнcтpyктop иэ другого пакета");
        System.out.println("n_pub = " + p.n_pub);
    }
}
