package IO.NIO;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/**
 * 向已有的zip文件中添加新文件的传统做法
 */
public class AddFileToZip {
    public static void main(String[] args) {
    }

    public static void addFileToZip(File zipFile, File fileToAdd) throws IOException {
        File tempFile = File.createTempFile(zipFile.getName(), null);
        tempFile.delete();
        zipFile.renameTo(tempFile);
        try (ZipInputStream input = new ZipInputStream(new FileInputStream(tempFile));
             ZipOutputStream output = new ZipOutputStream(new FileOutputStream(zipFile))) {
            ZipEntry entry = input.getNextEntry();
            byte[] buf = new byte[8192];
            while (entry != null) {
                String name = entry.getName();
                if (!name.equals(fileToAdd.getName())) {
                    output.putNextEntry(new ZipEntry(name));
                    int len = 0;
                    while ((len = input.read(buf)) > 0) {
                        output.write(buf, 0, len);
                    }
                }
                entry = input.getNextEntry();
            }
            try (InputStream newFileInput = new FileInputStream(fileToAdd)) {
                output.putNextEntry(new ZipEntry(fileToAdd.getName()));
                int len = 0;
                while ((len = newFileInput.read(buf)) > 0) {
                    output.write(buf, 0, len);
                }
                output.closeEntry();
            }
        }
        tempFile.delete();
    }
}
