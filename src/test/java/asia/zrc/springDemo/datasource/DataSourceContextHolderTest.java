package asia.zrc.springDemo.datasource;

import asia.zrc.springDemo.common.service.BaseService;
import asia.zrc.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zrc on 2016/9/17.
 */
public class DataSourceContextHolderTest extends BaseTest {
    @Autowired
    private BaseService baseService;

    @Test
    public void testChangeDataSource() {
        //使用默认的数据源
        System.out.println(baseService.getSystemTimeStamp());
        //切换数据源
        DataSourceContextHolder.setDataSourceType("dataSource_outer");
        System.out.println(baseService.getSystemTimeStamp());
        DataSourceContextHolder.clearDataSourceType();
        System.out.println(baseService.getSystemTimeStamp());
    }
}