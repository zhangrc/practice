package asia.zrc.learn.newfeature;

import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;

/**
 * Created by zrc on 2017/2/21.
 */
public class javaimpatient {


    @Test
    public void testSerial() throws URISyntaxException, IOException {

        Path path = Paths.get(getClass().getClassLoader().getResource("wap.txt").toURI());
        long l = System.currentTimeMillis();
        long count = Files.lines(path)
                .flatMap(r -> Stream.of(r.split("\\PL+")))
                .filter(s -> s.length() < 12)
                .count();
       // System.out.println(System.currentTimeMillis() - l);
    }

    @Test
    public void testParallel() throws URISyntaxException,IOException {

        Path path = Paths.get(getClass().getClassLoader().getResource("wap.txt").toURI());
        long l = System.currentTimeMillis();
        long count = Files.lines(path)
                .parallel()
                .flatMap(r -> Stream.of(r.split("\\PL+")))
                .filter(s -> s.length() < 12)
                .count();
       // System.out.println(System.currentTimeMillis() - l);
    }
}
