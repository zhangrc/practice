package asia.zrc.springDemo.common.DB.impl;

import asia.zrc.springDemo.common.DB.IDao;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by zrc on 2016/9/9.
 */
public class Dao implements IDao {
    private SqlSessionTemplate dao;


    public Object queryObject(String id) {
        return dao.selectOne(id);
    }

    public Object queryObject(String id, Object obj) {
        return dao.selectOne(id,obj);
    }

    public void setDao(SqlSessionTemplate dao) {
       this.dao = dao;
    }
}
