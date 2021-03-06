package asia.zrc.springDemo.common.service;

import asia.zrc.BaseTest;
import asia.zrc.springDemo.common.DB.IDao;
import asia.zrc.springDemo.common.service.impl.BaseServiceImpl;
import javafx.beans.binding.When;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.sql.Timestamp;
import static org.powermock.api.mockito.PowerMockito.*;

/**
 * Created by zrc on 2016/9/9.
 */
public class BaseServiceTest {

    @Ignore
    @Test
    public void testGetTimeStmp() {
        Timestamp except = new Timestamp(System.currentTimeMillis());
        BaseServiceImpl baseService = new BaseServiceImpl();
        IDao dao = mock(IDao.class);  //createMock(IDao.class);
//        dao.queryObject(eq("common.getSystemTimestamp"));
//        expectLastCall().andReturn(except);
        when(dao.queryObject("common.getSystemTimestamp")).thenReturn(except);
        //replay(dao);
        baseService.setDao(dao);
        Assert.assertEquals(except, baseService.getSystemTimeStamp());
    }



}