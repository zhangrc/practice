package asia.zrc.springDemo.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Created by zrc on 2016/9/9.
 */
public class DynamicDataSource  extends AbstractRoutingDataSource {

    protected Object determineCurrentLookupKey() {
        return null;
    }
}
