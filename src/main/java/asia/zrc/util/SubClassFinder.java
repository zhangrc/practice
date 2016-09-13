package asia.zrc.util;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.core.type.filter.AssignableTypeFilter;

import java.util.List;
import java.util.Set;

/**
 * Created by zrc on 2016/9/13.
 * spring 中获取一个类的所有子类
 * http://stackoverflow.com/questions/492184/how-do-you-find-all-subclasses-of-a-given-class-in-java
 */
public class SubClassFinder {
    public void test() throws ClassNotFoundException {
        ClassPathScanningCandidateComponentProvider provider = new ClassPathScanningCandidateComponentProvider(true);
        provider.addIncludeFilter(new AssignableTypeFilter(List.class));

        // scan in org.example.package
        Set<BeanDefinition> components = provider.findCandidateComponents("org/example/package");
        for (BeanDefinition component : components)
        {
            Class cls = Class.forName(component.getBeanClassName());
            // use class cls found
        }
    }
}
