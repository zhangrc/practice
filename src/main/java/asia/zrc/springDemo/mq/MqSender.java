package asia.zrc.springDemo.mq;

import java.util.HashMap;

/**
 * Created by zrc on 2016/9/19.
 */
public interface MqSender {
    /**
     * 发送消息
     * @param map 参数
     * @return
     */
    boolean send(final HashMap map);
}
