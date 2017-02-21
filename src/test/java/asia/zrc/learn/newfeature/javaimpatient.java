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

import static java.util.stream.Collectors.counting;

/**
 * Created by zrc on 2017/2/21.
 */
public class javaimpatient {

    @Test
    public void test1() throws IOException, URISyntaxException {
        Path path = Paths.get(getClass().getClassLoader().getResource("wap.txt").toURI());
        byte[] bytes = Files.readAllBytes(path);
        String str = new String(bytes);
        List<String> words = Arrays.asList(str.split("\\PL+"));

        long l = System.currentTimeMillis();
        long count = words.stream()
                .filter(s -> s.length() < 12)
                .count();
        System.out.println(System.currentTimeMillis() - l);

        l = System.currentTimeMillis();
        words.parallelStream()
                .filter(s -> s.length() <12)
                .collect(Collectors.groupingBy(String::length,counting())).size();
        System.out.println(System.currentTimeMillis() - l);
    }
}
