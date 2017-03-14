package asia.zrc.learn.thread;

import org.junit.Test;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

import static org.junit.Assert.*;

/**
 * Created by zrc on 2017/3/14.
 */
public class TestCounter {
    @Test
    public void testBasicFunctionality() {
        Counter counter = new Counter();
        assertEquals(0, counter.values());
        counter.increment();
        assertEquals(1, counter.values());
        counter.increment();
        assertEquals(2, counter.values());
    }

    @Test
    public void testThreadSafe() throws InterruptedException, BrokenBarrierException {
        final Counter counter = new Counter();
        final int numberOfThreads = 20;
        final int incrementsPerThread = 1000;


        CyclicBarrier entryBarrier = new CyclicBarrier(numberOfThreads + 1 );
        CyclicBarrier exitBarrier = new CyclicBarrier(numberOfThreads + 1 );


        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < incrementsPerThread; i++) {
                    counter.increment();
                }
            }
        };

        for (int i = 0; i < numberOfThreads; i++) {
            new SynchedThread(runnable,entryBarrier,exitBarrier).start();
            //new Thread(runnable).start();
        }

        assertEquals(0,counter.values());
        entryBarrier.await();
        exitBarrier.await();
        assertEquals(numberOfThreads * incrementsPerThread, counter.values());

    }
}
