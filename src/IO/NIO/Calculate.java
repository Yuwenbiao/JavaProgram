package IO.NIO;

import java.io.IOException;
import java.nio.file.*;

/**
 * 目录监视服务的使用示例
 */
public class Calculate {
    public static void calculate() throws IOException, InterruptedException {
        WatchService service = FileSystems.getDefault().newWatchService();
        Path path = Paths.get("").toAbsolutePath();
        System.out.println(path.toString());
        path.register(service, StandardWatchEventKinds.ENTRY_CREATE);
        while (true) {
            WatchKey key = service.take();
            for (WatchEvent<?> event : key.pollEvents()) {
                Path createPath = (Path) event.context();
                createPath = path.resolve(createPath);
                long size = Files.size(createPath);
                System.out.println(createPath + "==>" + size);
            }
            key.reset();
        }
    }

    public static void main(String[] args) throws Exception {
        calculate();
    }
}
