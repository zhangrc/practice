package asia.zrc.springDemo.mq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;

/**
 * Created by zrc on 2016/9/19.
 */
@Component("reciver")
public class ActiveMqReciver implements MqReciver {
    //@Autowired
    private JmsTemplate jmsTemplate;

    @Override
    public Object recive() {
        Message receive = jmsTemplate.receive("mis");
        try {
            return receive.getObjectProperty("mis");
        } catch (JMSException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Object recive(String destinationName) {
        return jmsTemplate.receive(destinationName);
    }
}
