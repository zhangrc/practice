package asia.zrc.springDemo.common.service;

import base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by zrc on 2016/9/9.
 */
public class BaseServiceTest  extends BaseTest{

    @Test
    public void testGetTimeStmp() {
        System.out.println(applicationContext.containsBean("dao"));
        BaseService service = (BaseService) super.getBean("baseService");
        System.out.println("the server time is :" + service.getSystemTimeStamp());
    }

}