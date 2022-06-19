package homework.dynamicArray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray array = new DynamicArray();
        String empty = "";
        String empty1 = "f";
        System.out.println(empty.isEmpty());
        System.out.println(empty1.isEmpty());
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(5);
        array.add(6);
        System.out.println("Element is " + array.getByIndex(2));
        System.out.println("first elment " + array.getFirstIndexByValue(0));
        array.set(3,4);
        array.add(4,5);
        array.delete(2);
        array.printArray();



    }
}
