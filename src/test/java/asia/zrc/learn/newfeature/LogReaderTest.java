package asia.zrc.learn.newfeature;

import org.junit.Test;

import java.io.IOException;

/**
 * Created by zrc on 2017/2/20.
 */
public class LogReaderTest {

    @Test
    public void testReadLog() throws IOException {
        MisLog log = new MisLog("D:\\soft\\apache-tomcat-7.0.70\\logs\\erp.log");
        System.out.println(log.getCount("at"));
    }
    @Test
    public void testDelAt() throws IOException {
        MisLog log = new MisLog("D:\\soft\\apache-tomcat-7.0.70\\logs\\erp.log");
        log.delAt();
    }
}
