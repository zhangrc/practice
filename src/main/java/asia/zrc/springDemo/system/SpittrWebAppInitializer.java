package asia.zrc.springDemo.system;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by zrc on 2016/9/12.
 * 在非servlet3.0环境下需要配置web.xml 在servlet3.0 环境下 可以直接通过代码来控制
 * web环境下，通常情况下会有两个上下文
 * 一个是通过DispatcherServlet初始化的web controller
 * 一个是通过ContextLoaderListener 初始化的业务bean service dao 等
 */
public class SpittrWebAppInitializer /*extends AbstractAnnotationConfigDispatcherServletInitializer*/ {
    /**
     * 初始化 业务bean 替代ContextLoaderListener
     * @return
     */
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{RootConfig.class};
    }

    /**
     * 初始化 controller 的bean
     * 替代DispatcherServlet 的配置
     * @return
     */
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] {WebConfig.class};
    }

    /**
     * spring mvc 需要解析的路径
     * @return
     */
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
