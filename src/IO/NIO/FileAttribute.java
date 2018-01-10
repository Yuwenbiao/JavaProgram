package IO.NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileTime;

public class FileAttribute {
    public static void useFileAttrbuteView() throws IOException {
        Path path = Paths.get("scores.txt");
        DosFileAttributeView view = Files.getFileAttributeView(path, DosFileAttributeView.class);
        if (view != null) {
            DosFileAttributes attrs = view.readAttributes();
            System.out.println(attrs.isReadOnly());
        }
    }

    public static boolean checkUpdatesRequired(Path path, int intervalInMillis) throws IOException {
        FileTime lastModifiedTime = (FileTime) Files.getAttribute(path, "lastModifiedTime");
        long now = System.currentTimeMillis();
        return now - lastModifiedTime.toMillis() > intervalInMillis;
    }

    public static void main(String[] args) throws IOException {
        useFileAttrbuteView();
        System.out.println(checkUpdatesRequired(Paths.get("scores.txt"), 2000000000));
    }
}
