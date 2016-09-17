package asia.zrc.springDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by zrc on 2016/9/16.
 */
@Controller
public class HomeController {

    @RequestMapping(value="/home",method = RequestMethod.GET)
    public String home() {
        System.out.println("1");
       return "/WEB-INF/home";
    }
}
