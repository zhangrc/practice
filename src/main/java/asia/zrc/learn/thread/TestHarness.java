package asia.zrc.learn.thread;

import java.util.concurrent.CountDownLatch;

/**
 * Created by zrc on 2017/4/29.
 */
public class TestHarness {

    public long timeTasks(int nThreads , final Runnable task) throws InterruptedException {
        //初始化两个拦截锁，一个用作开始，一个用作结束
        final CountDownLatch startGate = new CountDownLatch(1);
        //有多少个子线程就要设置多少个拦截锁 。
        final CountDownLatch endGate   = new CountDownLatch(nThreads);

        for (int i = 0 ; i < nThreads ; i ++ ) {
            Thread t = new Thread(()-> {
                try {
                    //所有子线程等待
                    startGate.await();
                    try{
                        task.run();
                    }finally {
                        endGate.countDown();
                    }
                }catch (InterruptedException ignore) {}
            },"Thread-"+i);
            t.start();
        }
        Thread.sleep(1000);
        long start = System.nanoTime();
        //放开所有线程
        startGate.countDown();
        //主线程等待，当所有子线程都结束后，在继续主线程
        endGate.await();
        System.out.println("---------main ---");
        return System.nanoTime() - start;
    }
}
