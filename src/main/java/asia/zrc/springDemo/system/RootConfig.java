package asia.zrc.springDemo.system;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by zrc on 2016/9/16.
 * ContextLoaderListener初始化的bean
 */
@Configuration
@ComponentScan(basePackages = {"asia.zrc.springDemo"},excludeFilters = {
        @ComponentScan.Filter(type= FilterType.ANNOTATION,value = EnableWebMvc.class)
})
public class RootConfig{
}
