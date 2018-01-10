package IO.二进制IO;

import java.io.IOException;
import java.io.RandomAccessFile;

public class TestRandomAccessFile {
    public static void main(String[] args) throws IOException {
        RandomAccessFile inout = new RandomAccessFile("inout.dat", "rw");
        inout.setLength(0);
        for (int i = 0; i < 200; i++)
            inout.writeInt(i);
        System.out.println(inout.length());
        inout.seek(0);
        System.out.println(inout.readInt());
        inout.seek(1 * 4);
        System.out.println(inout.readInt());
        inout.seek(9 * 4);
        System.out.println(inout.readInt());
        inout.writeInt(555);
        inout.seek(inout.length());
        inout.writeInt(999);
        System.out.println(inout.length());
        inout.seek(10 * 4);
        System.out.println(inout.readInt());
        inout.close();
    }
}
