package homeworks.arrayutil1;

public class PracticeHomeworkDemo {
    public static void main(String[] args) {
        PracticeHomework longToInt = new PracticeHomework();
        int minute = 2;
        System.out.println("Minute: " + minute);
        System.out.println(longToInt.convert(minute));
        int years = 2;
        System.out.println("Years: " + years);
        System.out.println(longToInt.calcAge(years));
        int nextNumber1 = 6;
        System.out.print("Next number is -> ");
        System.out.println(longToInt.nextNumber(nextNumber1));
        int a = 77;
        int b = 77;
        System.out.print("Is same number -> ");
        System.out.println(longToInt.isSameNum(a,b));
        int number = 0;
        System.out.print("Equal to zero -> ");
        System.out.println(longToInt.lessThanOrEqualToZero(number));
        int[] array1 = {5,6,7,8,88};
        int[] array2 = {22,11,7,8,808};
        System.out.println(longToInt.maxLength(array1,array2));
    }
}
