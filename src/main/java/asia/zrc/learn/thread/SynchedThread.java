package asia.zrc.learn.thread;

import java.util.concurrent.CyclicBarrier;

/**
 * Created by zrc on 2017/3/14.
 */
public class SynchedThread extends Thread{
    private CyclicBarrier entryBarrier;
    private CyclicBarrier exitBarrier;

    public SynchedThread(Runnable runnable, CyclicBarrier entryBarrier, CyclicBarrier exitBarrier) {

        super(runnable);
        this.entryBarrier = entryBarrier;
        this.exitBarrier = exitBarrier;
    }

    @Override
    public void run() {
        try {
            entryBarrier.await();
            super.run();
            exitBarrier.await();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
