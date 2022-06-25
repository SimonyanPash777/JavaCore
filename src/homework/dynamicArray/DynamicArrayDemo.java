package homework.dynamicArray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray array = new DynamicArray();
        String empty = "";
        String empty1 = "f";
        System.out.println(empty.isEmpty());
        System.out.println(empty1.isEmpty());
        array.add(23);
        array.add(36);
        array.add(71);
        array.add(65);
        array.add(73);
        System.out.println("Element is " + array.getByIndex(2));
        System.out.println("first elment " + array.getFirstIndexByValue(0));
        array.set(1,4);
        array.add(3,2);
        array.delete(2);
        array.printArray();



    }
}
