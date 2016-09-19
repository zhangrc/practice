package asia.zrc.springDemo.mq;

/**
 * Created by zrc on 2016/9/19.
 */
public interface MqReciver {
    Object recive();

    Object recive(String destinationName);
}
