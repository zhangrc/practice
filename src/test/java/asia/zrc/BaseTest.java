package asia.zrc;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(locations = { "classpath:app-context.xml","classpath:springMvc.xml" })
public class BaseTest extends AbstractJUnit4SpringContextTests {

    public <T> T getBean(Class<T> t) {
        return super.applicationContext.getBean(t);
    }

    public Object getBean(String beanName) {
        return super.applicationContext.getBean(beanName);
    }

}
