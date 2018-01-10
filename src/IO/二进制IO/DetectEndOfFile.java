package IO.二进制IO;

import java.io.*;

public class DetectEndOfFile {
    public static void main(String[] args) {
        try {
            DataOutputStream output = new DataOutputStream(new FileOutputStream("test.dat"));
            output.writeDouble(4.5);
            output.writeDouble(4.5);
            output.writeDouble(4.5);
            output.close();

            DataInputStream input = new DataInputStream(new FileInputStream("test.dat"));
            while (true) {
                System.out.println(input.readDouble());
            }
        } catch (EOFException e) {
            System.out.println("All data read");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}