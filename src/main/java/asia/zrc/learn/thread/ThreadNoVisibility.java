package asia.zrc.learn.thread;

/**
 * Created by zrc on 2017/4/20.
 */
public class ThreadNoVisibility {
    private static Boolean ready ;
    private static Integer number;

    private static class ReadyThread extends Thread {
        @Override
        public void run() {
            while (!ready) {
                Thread.yield();
            }
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        new ReadyThread().start();
        number = 42;
        ready = true;
    }

}
