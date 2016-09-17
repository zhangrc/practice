package asia.zrc.springDemo.common.service;

import asia.zrc.BaseTest;
import org.junit.Test;

/**
 * Created by zrc on 2016/9/9.
 */
public class BaseServiceTest  extends BaseTest {

    @Test
    public void testGetTimeStmp() {
        System.out.println(applicationContext.containsBean("dao"));
        BaseService service = (BaseService) super.getBean("baseService");
        System.out.println("the server time is :" + service.getSystemTimeStamp());
    }

}