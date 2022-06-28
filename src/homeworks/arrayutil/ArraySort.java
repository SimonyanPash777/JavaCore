package homeworks.arrayutil;

public class ArraySort {
    public static void main(String[] args) {
        System.out.println("ԱՌԱՋԱԴՐԱՆՔ 1");
        int[] numbers = {43, 55, 5, -9, 0, 12, 6, 65};
        int variable = 0; // Ամենա փոքր էլեմենտն է
        System.out.print("Փոքրից մեծ սորտավորված էլեմենտներն են՝ ");
        for (int i = 0; i < numbers.length; i++) { // ՈՐՊԵՍԶԻ ՖՌԱ 0-ԻՑ ՄԻՆՋև ՄԱՍՍԻՎԻ ԵՐԿԱՐՈՒԹՅՈՒՆ
            for (int j = i + 1; j < numbers.length; j++) { // Որպեսզի գտնենք ամենափոքր էլեմենտի ինդեքսը այսինքն
                                                          // ցիկըլը ֆռա այնքան մինջև համեմատելով գտնի փոքր էլեմենտը
                if (numbers[i] > numbers[j]) {
                    variable = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = variable;
                }
            }
            System.out.print(numbers[i] + " ");
         }

        System.out.println();

        int variable2 = 0;
        System.out.print("Մեծից փոքր սորտավորված էլեմենտներն են՝ ");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    variable2 = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = variable2;
                }
            }
            System.out.print(numbers[i] + " ");
        }
      }
    }