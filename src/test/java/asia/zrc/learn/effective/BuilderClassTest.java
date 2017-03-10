package asia.zrc.learn.effective;

import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;

/**
 * Created by zrc on 2017/3/7.
 */
public class BuilderClassTest {
    @Test
    public void testUseConstrustor() {
        BuilderClass build = new BuilderClass.Builder(240, 8)
                .setCalories(10)
                .setCarbohydrate(2)
                .setFat(10)
                .setSodium(3)
                .build();
    }

    @Test
    public void StringTest() {
        String a = "abc";
        String str = new String("abc");
        Assert.assertEquals(a,str);
        FileInputStream
    }
}