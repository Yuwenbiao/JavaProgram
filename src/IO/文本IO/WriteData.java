package IO.文本IO;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteData {
    public static void main(String[] args) throws IOException {
        File file = new File("scores.txt");
        if (file.exists()) System.exit(0);
        PrintWriter output = new PrintWriter(file);
        output.print("jflljf");
        output.print(99);
        output.println("jf");
        output.println(9);

        output.close();
    }
}
