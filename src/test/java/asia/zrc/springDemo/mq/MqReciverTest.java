package asia.zrc.springDemo.mq;

import asia.zrc.BaseTest;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by zrc on 2016/9/19.
 */
@Ignore
public class MqReciverTest extends BaseTest {
    @Autowired
    private MqReciver reciver;
    @Autowired
    private MqSender sender;
    @Test
    public void recive() throws Exception {
        HashMap map = new HashMap();
        map.put("123",123);
        sender.send(map);
        map.clear();
        map = (HashMap) reciver.recive();
        System.out.println(map);
    }

}