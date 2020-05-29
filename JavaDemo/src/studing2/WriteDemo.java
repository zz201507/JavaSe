package studing2;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class WriteDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\JAVA\\Work\\xtx.txt");
        RandomAccessFile r1 = new RandomAccessFile("D:\\JAVA\\Work\\xtx.txt","rw");
        r1.seek(8);
        byte bytes[] = new byte[(int) file.length()];
        r1.read(bytes,0, (int) file.length());
        String name = new String(bytes);
        System.out.println(name);

    }
}
