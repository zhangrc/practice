package asia.zrc.learn.newfeature;

import org.junit.Test;

import java.io.*;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Created by zrc on 2017/2/20.
 */
public class Nio {
    @Test
    public void testNio() throws URISyntaxException, IOException {
        Path path = Paths.get(getClass().getClassLoader().getResource("wap.txt").toURI());
        InputStream inputStream = Files.newInputStream(path, StandardOpenOption.READ);
        OutputStream outputStream = Files.newOutputStream(path, StandardOpenOption.APPEND);
        byte[] b = new byte[1024*1024];
        if(1==1) {
            throw new Error("这是一个错误的程序，会导致死机！");
        }
        int c ;
        while( (c = inputStream.read(b)) != -1) {
            outputStream.write(b,0,c);
        }
    }
}
