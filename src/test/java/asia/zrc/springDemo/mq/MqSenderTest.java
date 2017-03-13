package asia.zrc.springDemo.mq;

import asia.zrc.BaseTest;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;

/**
 * Created by zrc on 2016/9/19.
 */
@Ignore
public class MqSenderTest extends BaseTest{
    @Autowired
    private MqSender sender;
    @Test
    public void testSend() {
        HashMap map = new HashMap();
        map.put("h", "helloworld");
        sender.send(map);
    }
}