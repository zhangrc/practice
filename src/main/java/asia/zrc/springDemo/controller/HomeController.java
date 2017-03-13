package asia.zrc.springDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by zrc on 2016/9/16.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/home/{id}", method = RequestMethod.GET)
    public ModelAndView home(@PathVariable("id") long id) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/WEB-INF/home");
        mv.addObject("id",id+"name");
        return mv;
    }
}
