package asia.zrc.learn.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created by zrc on 2017/4/29.
 */
public class PreLoader {

    private final FutureTask<Integer> future = new FutureTask<Integer>(new Callable<Integer>() {
        @Override
        public Integer call() throws Exception {
            return loadInt();
        }
    });

    private int loadInt() {
        return 100;
    }

    private final Thread thread = new Thread(future);
    public void start() {thread.start();}

    public int get() {
        try{
            return future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
//            if (e instanceof AppException)
            e.printStackTrace();
        }
        return 0;
    }
}
