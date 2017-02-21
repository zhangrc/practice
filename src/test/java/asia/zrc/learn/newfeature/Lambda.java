package asia.zrc.learn.newfeature;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by zrc on 2017/2/14.
 */
public class Lambda {
    @Test
    public void testLambda() throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        executor.execute(() -> {
            System.out.println("");
        });
        Future<Integer> submit = executor.submit(() -> {
            int count = 0;
            for (int i = 0; i < 100; ) {
                i = i + 2;
                count = count + i;
            }
            return count;
        });

        String world = "111";

        Set<Path> paths = new HashSet<>();


        List<Callable<Long>> tasks = new ArrayList<>();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("--------");
            }
        });

        Thread thread1 = new Thread(()-> System.out.println("----------"));
    }

    @Test
    public void testPaths() throws IOException {
        Path path = Paths.get("D:\\soft\\tomcat_\\logs");
        List array = new ArrayList();

        Stream<Path> log = Files.list(path)
                .filter(p -> {
                    return p.getFileName().endsWith("log");
                });

    }

    @Test
    public void testList() {
        final List<Integer> numbers = Arrays.asList(1, -2, 3, 4);
        List<Integer> collect = numbers.stream()
                .map(i -> i * i)
                .collect(Collectors.toList());
        System.out.println(collect);
        int reduce = numbers.stream()
                .filter(i -> i % i == 0)
                .map(Math::abs)
                .map(i -> i + 1)
                .reduce(1,(i, j) -> i * j);
        System.out.println(reduce);
    }
}

