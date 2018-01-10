package IO.二进制IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class TestObjectOutputStream {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("object.dat"));
        output.writeUTF("John");
        output.writeDouble(443.2);
        output.writeObject(new Date());

        output.close();
    }
}
