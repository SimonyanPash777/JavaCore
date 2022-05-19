package chapters.chapter5;

public class StringSwitch {
    public static void main(String[] args) {
        String str = "երկուս";
        switch (str) {
            case "մեկ": {
                System.out.println("մեկ");
                break;
            }
            case "երկուս": {
                System.out.println("երկուս");
                break;
            }
            case "երեք": {
                System.out.println("երեք");
                break;
            }
                default:
                    System.out.println(" չի համընկնում ");
                    break;
        }
    }
}
