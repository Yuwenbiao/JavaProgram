package IO.文本IO;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) throws IOException {
        File file = new File("scores.txt");
        Scanner input = new Scanner(file);

        while (input.hasNext()) {
            String a = input.next();
            int b = input.nextInt();
            System.out.println(a + b);
        }
        input.close();
    }
}
