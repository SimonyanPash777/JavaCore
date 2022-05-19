package homework.arrayutil;

public class CharArrayExample {
    public static void main(String[] args) {
        System.out.println("ԱՌԱՋԱԴՐԱՆՔ 1");
        char[] chars = {'j','a','v','a','l','o','v','e' };
        char c = 'a';
        int  count  = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                count++;
            }

        }
        System.out.print("Փոփոխականի քանակը հավասար է " + count);
        System.out.println( );
        System.out.println( );
        System.out.println("ԱՌԱՋԱԴՐԱՆՔ 2");
        char[] chars2 = {'j','a','v','a','l','o','v','e'};
        System.out.print(chars2[chars2.length - 5]);
        System.out.print(" ");
        System.out.println(chars2[chars2.length - 4]);
        System.out.println( );

        System.out.println("ՌԱՋԱԴՐԱՆՔ 3");



    }

}
/*
int qanak = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
             qanak ++;

        }
 */