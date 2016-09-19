package asia.zrc.springDemo.mq;

import java.util.Map;

/**
 * Created by zrc on 2016/9/19.
 */
public class dataHandler {
    public void handler(Map map) {
        System.out.println("in listener");
        System.out.println(map);
    }
}
