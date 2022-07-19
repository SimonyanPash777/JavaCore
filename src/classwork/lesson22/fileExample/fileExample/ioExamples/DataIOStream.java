package classwork.lesson22.fileExample.fileExample.ioExamples;

import java.io.*;

public class DataIOStream {

    private static final String FILE_PATH = "C:\\Users\\USER\\IdeaProjects\\JavaCore\\src\\classwork\\lesson22\\fileExample\\fileExample\\ioExamples\\file\\example.txt";

    public static void main(String[] args) throws IOException {
        write();
         read();
    }

    public static void write() throws IOException {
        DataOutputStream out = new DataOutputStream(new FileOutputStream(FILE_PATH));
        out.write(543);
        out.writeBoolean(true);

        out.close();
    }

    public static void read() throws IOException {
        BufferedReader inputStream = new BufferedReader(new FileReader(FILE_PATH));
        System.out.println(inputStream.read());
        System.out.println(inputStream.ready());

        inputStream.close();
    }

}
