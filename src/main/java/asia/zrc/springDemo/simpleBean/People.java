package asia.zrc.springDemo.simpleBean;

import org.springframework.stereotype.Component;

/**
 * Created by zrc on 2016/9/9.
 */
@Component("people")
public class People {
    private String name;

    private String age;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
