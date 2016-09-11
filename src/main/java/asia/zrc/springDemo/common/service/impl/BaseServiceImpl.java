package asia.zrc.springDemo.common.service.impl;

import asia.zrc.springDemo.common.DB.IDao;
import asia.zrc.springDemo.common.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;

/**
 * Created by zrc on 2016/9/9.
 */
@Service("baseService")
public class BaseServiceImpl implements BaseService {
    @Autowired
    private IDao dao;

    protected IDao getDao() {
        return this.dao;
    }

    public Timestamp getSystemTimeStamp() {
        return (Timestamp) getDao().queryObject("common.getSystemTimestamp");
    }
}
