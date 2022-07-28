package homework.collection;

import java.util.*;

public class CollectionExample {

    public static void main(String[] args) {
        String[] values = {"a", "aa", "aaa", "aaaa", "aaaaa"};

        System.out.println(arrayToList(values));
        System.out.println();

        List<String> stringList = new ArrayList<>();
        stringList.add("poxos");
        stringList.add("petros");
        stringList.add("mardiros");
        stringList.add("ani");
        stringList.add("artur");
        stringList.add("zaven");
        stringList.add("aram");
        System.out.println(removeById(stringList, 2));
        System.out.println();

        listToSet(stringList);
        System.out.println();

        List<Integer> setList = new ArrayList<>();
        setList.add(1);
        setList.add(2);
        setList.add(3);
        setList.add(4);
        setList.add(5);
        setList.add(6);
        setList.add(7);
        setList.add(7999);
        System.out.println();
        listToLinkedList(setList);
        System.out.println();
        System.out.println(reverseNumbers(setList));
        System.out.println();
        printFirstFive(stringList);
        System.out.println();
        System.out.println(sizeOfList(stringList));
        System.out.println();
    }

    //մեթոդը գրել այնպես, որ կանչենք, ու իրան ստրինգների մասիվ տանք, ինքը վերադարձնի նույն էլեմենտներով ArrayList
    static List<String> arrayToList(String[] values) {
        ArrayList<String> strings = new ArrayList<>(Arrays.asList(values));
        System.out.print("arrayToList -> ");
        return strings;
    }

    //մեթոդը գրել այնպես, որ կանչենք ու տանք ինչ որ լիստ, ու ինդեքս, ինքը ջնջե էդ ինդեքսի տակ գտնվող էլեմենտը, ու վերադարձնե նույն լիստը, առանց էդ էլեմենտի։
    static List<String> removeById(List<String> list, int index) {
        list.remove(index);
        System.out.print("removeById -> ");
        return list;
    }

    // մեթոդը գրել այնպես, որ ընդունի ցանկացած String-ների լիստ, վերադարձնի նույն արժեքներով HashSet
    static Set<String> listToSet(List<String> list) {
        Set<String> setList = new HashSet<>(list);
        System.out.print("listToSet -> ");
        for (String s : setList) {
            System.out.print(s + " ");
        }
        return null;
    }

    // մեթոդը գրել այնպես, որ ընդունի ցանկացած Integer-ների լիստ, վերադարձնի նույն արժեքներով LinkedList-ի օբյեկտ։
    static LinkedList<Integer> listToLinkedList(List<Integer> list) {
        LinkedList<Integer> setList = new LinkedList<>(list);
        System.out.print("listToLinkedList -> ");
        for (Integer integer : setList) {
            System.out.print(integer + " ");
        }
        return null;
    }

    // մեթոդը գրել այնպես, որ ընդունի ցանկացած Integer-ների լիստ, վերադարձնի նոր լիստ, որի մեջ էլեմենտները կլինեն հակառակ հերթականությամբ։
    static List<Integer> reverseNumbers(List<Integer> list) {
        Collections.reverse(list);
        System.out.print("reverseNumbers -> ");
        return list;
    }

    // մեթոդը գրել այնպես, որ ինչ մեծությամբ լիստ էլ տանք էս մեթոդին, ինքը տպե մենակ սկզբի 5 հատը։
    static void printFirstFive(List<String> list) {
        System.out.print("printFirstFive -> ");
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    // մեթոդը գրել այնպես, որ ինչ list տանք վերադարձնի թե քանի էլեմենտ կա էդ լիստ-ի մեջ
    static int sizeOfList(List<String> list) {
        int size = list.size();
        System.out.print("sizeOfList -> ");
        return size;
    }

}