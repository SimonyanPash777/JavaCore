package chapters.chapter5;

public class Search {
    public static void main(String[] args) {
        int[] nums = {2,4,6,5,12,8,9,3};
        int val = 5;
        boolean found = false;
        for (int x : nums) {
            if (x == val){
                found = true;
                break;
            }
        }
        if (found);
        System.out.println("Знaчeни e найдено ! " + found);
    }
}
