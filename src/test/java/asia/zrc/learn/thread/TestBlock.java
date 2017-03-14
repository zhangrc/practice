package asia.zrc.learn.thread;

import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by zrc on 2017/3/14.
 */
public class TestBlock {
    @Test
    public void testBlockingBehavior() throws Exception {
        final AtomicBoolean blocked = new AtomicBoolean(true);

        Thread buyer = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    new BlackMarket().buyTicket();
                    blocked.set(false);
                }catch (InterruptedException e){

                }
            }
        });

        buyer.start();
        Thread.sleep(1000);
        buyer.interrupt();
        buyer.join(1000);

        Assert.assertFalse("Thread didn't interrupt!",buyer.isAlive());
        Assert.assertTrue("Method didn't block!",blocked.get());
    }
}
