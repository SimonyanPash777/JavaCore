package homework.arrayutil1;

public class PracticeHomework {
    long convert(int minutes) {
        int seconds;
        seconds = minutes * 60;
        System.out.print("Seconds: ");
        return seconds;
    }

    int calcAge(int years) {
        int days;
        days = years * 365;
        System.out.print("Days: ");
        return days;
    }

    int nextNumber(int number) {
//        int next;
//        next = number;
        return ++number;
    }

    boolean isSameNum(int a, int b) {
//        if (a == b) {
//        } else if (a != b) {
//        }
        return a == b;
    }
    boolean lessThanOrEqualToZero(int number){
        return number <= 0;
    }
    boolean reverseBoolean(boolean b){
        return ! b;
//        if (b == true){
//            return false;
//        }else {
//            return true;
//        }
    }
    int maxLength(int[] array1, int[] array2){
        return array1.length > array2.length ? array1.length : array2.length;
    }
}
