package homeworks.arrayutil;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ','c','a','t',' ','b','i',' ','b',' ',' ', ' ',' ',' ', ' ',' ',' ', ' '};
        int first = 0;
        int last = 0;
        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[i] != ' '){
                first = i;
                break;
            }
        }
        for (int j = spaceArray.length - 1; j > 0; j--) {
            if (spaceArray[j] != ' '){
                last = j;
                break;
            }
        }
        char[] newChar = new char[last - first + 1];
        for (int i = 0; i < newChar.length; i++) {
            newChar[i] = spaceArray[first++];
            System.out.print(newChar[i]);
        }
    }
}
