package asia.zrc.springDemo.system;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.impl.LogFactoryImpl;
import org.springframework.web.context.ContextLoaderListener;

import javax.servlet.ServletContextEvent;

/**
 * Created by zrc on 2016/9/16.
 */
public class StartUpListener extends ContextLoaderListener {

    private static Log log = LogFactoryImpl.getLog(StartUpListener.class);

    @Override
    public void contextInitialized(ServletContextEvent event) {
        log.info("系统开始启动");
        super.contextInitialized(event);
        log.info("系统启动完成");
    }

    @Override
    public void contextDestroyed(ServletContextEvent event) {
        super.contextDestroyed(event);
    }
}
