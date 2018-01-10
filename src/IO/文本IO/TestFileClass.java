package IO.文本IO;

import java.io.File;
import java.util.Date;

public class TestFileClass {
    public static void main(String[] args) {
        File file = new File("array.dat");
        System.out.println("does it exist?" + file.exists());
        System.out.println(file.length());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.isDirectory());
        System.out.println(file.isAbsolute());
        System.out.println(file.isHidden());
        System.out.println(file.getAbsolutePath());
        System.out.println(new Date(file.lastModified()));
    }
}
