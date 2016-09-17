package asia.zrc.springDemo.controller;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by zrc on 2016/9/16.
 */
public class BaseController {

   public void write(Object obj){
      String str = JSONObject.toJSONString(obj);
      System.out.println(str);
   }
}
