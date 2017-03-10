package asia.zrc.learn.thread;

import org.junit.Test;

import java.util.concurrent.*;
import java.util.stream.Stream;

/**
 * Created by zrc on 2017/2/24.
 */
public class ThreadRunnerTest {
    @Test
    public void testGetWithBlock() throws InterruptedException, ExecutionException {
        int processCount = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(processCount);
        Future<?> submit = executor.submit(() -> {
            double defaultValue = 0;
            Double count = Stream.generate(Math::random).parallel()
                    //.filter(i -> i % 2 == 0)
                    .limit(1000)
                    .map(i -> i = i * 100)
                    .reduce(defaultValue, (i, j) -> i + j);
            return count;
        });
        Object o = submit.get();
        System.out.println("-------------------------------");
        System.out.println(o);
    }

    @Test
    public void testCachedThreadPool() {
        ExecutorService executor = Executors.newCachedThreadPool();
        executor.execute(() -> {
            for (int i =0 ;i < 1000; i++) {
                System.out.println("Hello " + i );
            }
        });
        executor.execute(()-> {
            for (int i =0 ;i < 1000; i++) {
                System.out.println("GoodBye " + i );
            }
        });
    }

    public void testForkJoin() {
        ExecutorService service = Executors.newFixedThreadPool(10);
    }

//    public static void main(String[] args) {
//        new ThreadRun().testCachedThreadPool();
//    }
}
