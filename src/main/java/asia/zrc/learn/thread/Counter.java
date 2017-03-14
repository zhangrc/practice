package asia.zrc.learn.thread;

/**
 * Created by zrc on 2017/3/14.
 */
public class Counter {

    int count = 0 ;

    public int values() {
        return count;
    }

    public void increment() {
        synchronized (Counter.class){
            count++;
        }
    }
}
