package asia.zrc.springDemo.common.DB;

/**
 * Created by zrc on 2016/9/9.
 */
public interface IDao {
    Object queryObject(String id);
    Object queryObject(String id,Object obj);
    int insert(String id,Object obj);
}
