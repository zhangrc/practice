package asia.zrc.springDemo.mq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import java.util.HashMap;

/**
 * Created by zrc on 2016/9/19.
 */
@Component("mqSender")
public class ActiveMqSender implements  MqSender{

    @Autowired
    private JmsTemplate jmsTemplate;
    @Override
    public boolean send(final HashMap map) {
        jmsTemplate.send("mis.queue", new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                return session.createObjectMessage(map);
            }
        });
        System.out.println("send complete");
        return true;
    }
}
