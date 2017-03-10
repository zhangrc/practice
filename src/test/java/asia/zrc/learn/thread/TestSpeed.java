package asia.zrc.learn.thread;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by zrc on 2017/2/21.
 */
public class TestSpeed {

    private List<String> words;

    @Test
    public void testSingleThread() throws URISyntaxException, IOException {
        long l = System.currentTimeMillis();
        words.stream().filter(s -> s.length() > 12).count();
        speed(l);
    }

    private void speed(long l) {
        System.out.println(System.currentTimeMillis() - l);
    }

    @Before
    public void getStrings() throws URISyntaxException, IOException {
        Path path = Paths.get(getClass().getClassLoader().getResource("wap.txt").toURI());
        words = Files.lines(path)
                .flatMap(r -> Stream.of(r.split("\\PL+")))
                .collect(Collectors.toList());
//        byte[] bytes = Files.readAllBytes(path);
//        String str = new String(bytes);
//        words = Arrays.asList(str.split("\\PL+"));
    }

    @Test
    public void testMuttlyThread() throws IOException, URISyntaxException, ExecutionException, InterruptedException {
//        double ceil = Math.ceil(words.size() / 8) + 1;
//        int threadCount = (int) ceil;
//        ExecutorService executor = Executors.newFixedThreadPool(8);
//        Collection<Callable<Long>> tasks = new ArrayList();
//        int fromIndex = 0;
//        for (int i = 0; i < threadCount; i++) {
//            int toIndex = threadCount * i;
//            Callable<Long> c = () -> {
//                List<String> temp = words.subList(fromIndex, toIndex);
//                long count = temp.stream().filter(s -> s.length() > 12).count();
//                return count;
//            };
//            tasks.add(c);
//        }
//        List<Future<Long>> futures = executor.invokeAll(tasks);
        System.out.println(words.size());
    }

}
