package homework.figure;

public class FigurePainter2 {
    public static void main(String[] args) {
        System.out.println("Figure 1 ");
        for (int i = 1; i <= 4; i++) {
            System.out.print("    ");
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= 4; j++) {
                System.out.print("* ");

            }
            System.out.println();
       }
        System.out.println("Figure 2");
        for (int i = 1; i < 5; i++) {
            System.out.print("      ");
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            System.out.print("      ");
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
