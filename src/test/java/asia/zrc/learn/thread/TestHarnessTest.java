package asia.zrc.learn.thread;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zrc on 2017/4/29.
 */
public class TestHarnessTest {

    @Test
    public void testTimeTask() throws InterruptedException {
        TestHarness testHarness = new TestHarness();

        testHarness.timeTasks(100,()->{
            System.out.println(Thread.currentThread().getName()+" is run ");
        });
    }

}