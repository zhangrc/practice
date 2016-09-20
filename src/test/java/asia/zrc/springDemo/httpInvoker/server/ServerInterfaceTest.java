package asia.zrc.springDemo.httpInvoker.server;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zrc on 2016/9/17.
 */

/**
 * 指定对于的spring 配置文件，不能使用一个配置文件
 */
@ContextConfiguration(locations = { "classpath:spring-test.xml"})
public class ServerInterfaceTest extends AbstractJUnit4SpringContextTests {
    @Ignore
    @Test
    public void testRemote() {
        ServerInterface service = (ServerInterface) super.applicationContext.getBean("userService");
        Map map = new HashMap();
        Map result = service.call(map);
        System.out.println(result.get("server"));
    }

}