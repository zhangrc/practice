package asia.zrc.springDemo.common.service;

import asia.zrc.springDemo.common.DB.IDao;

import java.sql.Timestamp;

/**
 * Created by zrc on 2016/9/9.
 */
public interface BaseService {

    Timestamp getSystemTimeStamp();

    void setDao(IDao dao);
}
