package homework.arrayutil;

public class CharArrayExample {
    public static void main(String[] args) {
        System.out.println("ԱՌԱՋԱԴՐԱՆՔ 1");
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'a';
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                count++;
            }
        }
        System.out.print("Փոփոխականի քանակը հավասար է " + count);
        System.out.println();
        System.out.println();
        System.out.println("ԱՌԱՋԱԴՐԱՆՔ 2");
        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        int mejtexiINdex = chars2.length / 2;
        int mejtexiMinusMekIndex = mejtexiINdex - 1;
        System.out.print(chars2[mejtexiMinusMekIndex] + " ");
        System.out.println(chars2[mejtexiINdex]);
        System.out.println();

        System.out.println("ՌԱՋԱԴՐԱՆՔ 3");
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        char l = 'l';
        char y = 'y';
        int verjiElementiIndex = chars3.length - 1;
        int naxaVerjiElementIndex = verjiElementiIndex - 1;
        if (chars3[verjiElementiIndex] == y && chars3[naxaVerjiElementIndex] == l) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        System.out.println();

        System.out.println("Առաջադրանք 4");
        char[] bobArray = {'b', 'a', 'b', 'o', 'l', 'a'};

        boolean x = false;
        for (int i = 0; i < bobArray.length - 2; i++) {
            if (bobArray[i] == 'b' && bobArray[i + 2] == 'b') {
                x = true;
            }

        }

        System.out.println(x);

        System.out.println("Առաջադրանք 5");
        int first = 0;
        int last = 0;
        char[] text = {' ', ' ', 'b', 'a', ' ', 'r', 'e', 'v', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' '){
                first = i;
                break;
            }
        }
        for (int j = text.length - 1; j > 0; j--) {
            if (text[j] != ' '){
             last = j;
             break;
            }
        }
        char[] newChar = new char[last - first + 1];
        for (int i = 0; i < newChar.length; i++) {
            newChar[i] = text[first++];
            System.out.print(newChar[i]);
        }
    }
}

//array.length == massivi elementneri qanakin    X
//arrray.lenght/2 ==X/2
//arrray.lenght/2+1 ==X/2-1
//{'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'}; -> massivn e
//{'0', '1', '2', '3', '4', '5', '6', '7'}; -> indexner

