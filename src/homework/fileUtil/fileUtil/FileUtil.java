package homework.fileUtil.fileUtil;

import java.io.*;
import java.util.Scanner;

public class FileUtil {

    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
//        fileSearch();
//        contentSearch();
//        printSizeOfPackage();
        findLines();
    }

    static void recursiaSearch(File directory, String fileName) {
        boolean name;
        File[] files = directory.listFiles();
        for (File file : files) {
            if (file.isFile() && file.getName().equals(fileName)) {
                name = true;
                System.out.println(name);
                System.out.println(file.getPath());
            } else if (file.isDirectory()) {
                recursiaSearch(file, fileName);
            }
        }
    }


    public static void recursia(File directory, String keyword) {

        String line;
        File[] files = directory.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                String filePath = file.getPath();

                try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                    while ((line = reader.readLine()) != null) {
                        if (line.contains(keyword)) {
                            System.out.println("Your keyword have " + file.getName() + " File PATH " + file.getAbsolutePath());
                            break;
                        }
                    }
                } catch (IOException e) {
                    System.err.println("WRONG KEYWORD");
                }
            }
        }
    }


    //այս մեթոդը պետք է սքաններով վերցնի երկու strig.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    static void fileSearch() {
        System.out.println("Please input PATH");
        String PATH = scanner.nextLine();
        File file = new File(PATH);
        if (file.isDirectory()) {
            System.out.println("Please input file name");
            String fileName = scanner.nextLine();
            recursiaSearch(file, fileName);
            if (!file.getName().equals(PATH)) {
                System.err.println("WRONG FAIL NAME");
                fileSearch();
            }
        } else {
            System.err.println("WRONG PATH");
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch() {
        System.out.println("Please input PATH");
        String PATH = scanner.nextLine();
        File file = new File(PATH);
        if (!file.exists() || file.isFile()) {
            System.err.println("PATH isn't correct");
            contentSearch();
        }
        File[] files = file.listFiles();
        for (File file1 : files)
            if (file.isDirectory() && file.listFiles().length > 0) {
                System.out.println("Please input KEYWORD");
                String KEYWORD = scanner.nextLine();
                recursia(file, KEYWORD);
            }
    }


    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLines() {
        System.out.println("Please input txt path");
        String TXT_PATH = scanner.nextLine();
        File KEYWORD = new File(TXT_PATH);
        if (KEYWORD.isFile()) {
            System.out.println("Pleace input keyword");
            String keyword = scanner.nextLine();
            try (BufferedReader reader = new BufferedReader(new FileReader(TXT_PATH))) {
                String line;
                int variable = 0;
                while ((line = reader.readLine()) != null) {
                    variable++;
                    if (line.contains(keyword)) {
                        System.out.println(variable + " " + line);
                    }
                }
            } catch (IOException e) {
                System.err.println("WRONG FILE");
            }
        } else {
            System.err.println("WRONG PATH");
        }

    }

    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static void printSizeOfPackage() {
        System.out.println("Please input PATH");
        String PATH = scanner.nextLine();
        File file = new File(PATH);
        if (file.exists() || file.isDirectory()) {
            long num = 0;
            for (File listFile : file.listFiles()) {
                num += listFile.length();
            }
            System.out.println("Size is package ->" + PATH + " " + (num / 1024 / 1024) + ".mb");
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void createFileWithContent() {
        System.out.println("Please input path");
        String path = scanner.nextLine();
        System.out.println("Please input file name");
        String fileName = scanner.nextLine();
        String filePath = path + File.separator + fileName;
        File myFile = new File(filePath);
        boolean newFile;
        newFile = false;
        try {
            newFile = myFile.createNewFile();
        } catch (IOException e) {
            System.err.println("FILE NO CREATED");
        }
        if (newFile) {
            System.out.println("Please input content");
            String content = scanner.nextLine();
            try (BufferedWriter bufWrit = new BufferedWriter(new FileWriter(filePath))) {
                bufWrit.write(content);
            } catch (IOException e) {
                System.err.println("FILE CAN'T WRITE");
            }
        } else {
            System.err.println("FAIL CAN'T CRATE");
        }

    }

}

