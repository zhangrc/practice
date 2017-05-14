package asia.zrc.learn.mockTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.*;

/**
 * Created by zrc on 2017/5/14.
 */
@RunWith(PowerMockRunner.class)
public class TargetTest {

    @Test
    @PrepareForTest(Target.class)
    public void testOut() {
        PowerMockito.mockStatic(Target.class);
        PowerMockito.when(Target.out()).thenReturn(3);

        TargetService service  = new TargetService();
        service.getOutInt();
    }
}