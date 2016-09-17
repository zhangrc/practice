package asia.zrc.springDemo.httpInvoker.server;

import java.util.Calendar;
import java.util.Map;

/**
 * Created by zrc on 2016/9/17.
 */
public class ServerImpl implements ServerInterface {
    @Override
    public Map call(Map param) {
        System.out.println(Calendar.getInstance().getTime().toString() + " in server");
        param.put("server","server");
        return param;
    }
}
