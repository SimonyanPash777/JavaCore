package homeworks.arrayutil1;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        int[] array = {2, 1, 12, 18, 3, 99, 61};
        ArrayUtil1 myArrayUtil = new ArrayUtil1();
        System.out.println("Is the largest number " + myArrayUtil.max(array));
        System.out.println("Is the smallest number " + myArrayUtil.min(array));
        myArrayUtil.pairs(array);
        System.out.println();
        System.out.println("Number of pairs -> " + myArrayUtil.numberOfPairs(array));
        System.out.println("Number of points -> " + myArrayUtil.numberOfPoints(array));
        System.out.println("Sum of massive -> " + myArrayUtil.sumOfMassive(array));
        myArrayUtil.divide(array);
    }
}
