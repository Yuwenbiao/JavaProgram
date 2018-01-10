package IO.二进制IO;

import java.io.*;

public class Copy {
    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.out.println("error");
            System.exit(0);
        }

        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("not exits");
            System.exit(0);
        }

        File targeFile = new File(args[1]);
        if (targeFile.exists()) {
            System.out.println("already exits");
            System.exit(0);
        }

        BufferedInputStream input = new BufferedInputStream(new FileInputStream(sourceFile));
        BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(targeFile));

        int r;
        int numberOfBytesCopied = 0;
        while ((r = input.read()) != -1) {
            output.write((byte) r);
            numberOfBytesCopied++;
        }

        input.close();
        output.close();

        System.out.println(numberOfBytesCopied);
    }
}
