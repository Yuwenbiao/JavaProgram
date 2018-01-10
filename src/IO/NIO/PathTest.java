package IO.NIO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {
    public static void usePath() {
        Path path1 = Paths.get("folder1", "sub1");
        Path path2 = Paths.get("folder2", "sub2");
        System.out.println(path1.resolve(path2));
        System.out.println(path1.resolveSibling(path2));
        System.out.println(path1.relativize(path2));
        System.out.println(path1.subpath(0, 1));
        System.out.println(path1.startsWith(path2));
        System.out.println(path1.endsWith(path2));
        System.out.println(Paths.get("folder1/./../folder2/my.text").normalize());
    }

    public static void main(String[] args) {
        usePath();
    }
}
