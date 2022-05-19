package chapters.chapter5;

public class MissingBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 12; i++) {
            switch(i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("i փոքր է 5-ից");
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("i մեծ է 10-ից");
                    break;
                    default:
                        System.out.println("i հավասար կամ մեծ է 10-ից");
            }

        }
    }
}
