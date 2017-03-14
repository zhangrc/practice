package asia.zrc.util;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by zrc on 2017/3/14.
 */
public class SystemTimeTest {

    @Test
    public void clockReturnsValidTimeInMilliseconds() throws Exception {
        long before = System.currentTimeMillis();
        long clock = SystemTime.asMillis();
        long after = System.currentTimeMillis();
        assertBetween(before, clock, after);
    }

    private void assertBetween(long before, long clock, long after) {
        assertTrue("Should've returned somthing between " + before
                        + " and " + after + " (instead of " + clock + ")",
                before <= clock && clock <= after
        );
    }


    @Test
    public void clockReturnsFakedTimeInMilliseconds() {
        final long fakeTime = 123456790L;
        SystemTime.setTimeSource(new TimeSource() {
            public long millis() {
                return fakeTime;
            }
        });
        long clock = SystemTime.asMillis();
        Assert.assertEquals("Should return fake time ",fakeTime,clock);
    }


    @After
    public void resetTimeSource() {
        SystemTime.reset();
    }
}
