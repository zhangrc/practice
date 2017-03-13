package asia.zrc.learn.newfeature;

import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by zrc on 2017/2/20.
 */
public class LogReaderTest {

    @Ignore
    @Test
    public void testReadLog() throws IOException {
        MisLog log = new MisLog("D:\\soft\\apache-tomcat-7.0.70\\logs\\erp.log");
    }
    @Ignore
    @Test
    public void testDelAt() throws IOException {
        MisLog log = new MisLog("D:\\soft\\apache-tomcat-7.0.70\\logs\\erp.log");
        log.delAt();
    }
}
