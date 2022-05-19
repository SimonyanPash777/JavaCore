package chapters.chapter5;

public class IfElse {
    public static void main(String[] args) {
        int month = 17;
        String season;
        if (month == 12 || month == 1 || month == 2) {
            season = " Ձմեռ ";
        }
       else if (month == 3 || month == 4 || month == 5) {
            season = " Գարուն ";
        }
       else if (month == 6 || month == 7 || month == 8) {
            season = " Ամառ ";
        }
       else if (month == 9 || month == 10 || month == 11) {
            season = " Աշուն ";
        }
       else {
            season = " Սխալ գրվացք";
        }
        System.out.println("Ապրիլ ամիսը " + season + " Է։ ");


    }
}
