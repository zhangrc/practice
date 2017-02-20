package asia.zrc.learn.newfeature;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Created by zrc on 2017/2/20.
 */
public class MisLog {

    private Path path;

    public MisLog(String logFile) throws FileNotFoundException {
        path = Paths.get(logFile);
        if (path.toFile().isDirectory()) {
            throw new FileNotFoundException("args " + logFile + " is not a File");
        }
    }

    public int getCount(String at) throws IOException {
        return (int) Files.lines(path, Charset.forName("UTF-8"))
                .flatMap(s -> {
                   return Stream.of(s.split(" "));
                })
                .map(s -> s.trim())
                .filter(s -> s.equals(at))
                .count();

    }

    public void delAt() {
    }
}
