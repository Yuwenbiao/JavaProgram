package IO.NIO;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ListFilesTest {
    private static void listFiles() throws IOException {
        Path path = Paths.get("D:\\项目\\java\\深入理解Java7\\src\\com\\company");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(path, "*.java")) {
            for (Path entry : stream) {
                System.out.println(path);
            }
        }
    }

    public static void main(String[] args) {
        try {
            listFiles();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
