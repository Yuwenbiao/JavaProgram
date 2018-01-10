package IO.二进制IO;

import java.io.*;

public class TestDataStream {
    public static void main(String[] args) throws IOException {
        DataOutputStream output = new DataOutputStream(new FileOutputStream("temp.dat"));
        output.writeUTF("John");
        output.writeDouble(33.3);

        output.close();

        DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"));
        System.out.println(input.readUTF());
        System.out.println(input.readDouble());
    }
}
