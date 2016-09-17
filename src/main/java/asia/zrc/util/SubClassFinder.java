package asia.zrc.util;

/**
 * Created by zrc on 2016/9/13.
 * spring 中获取一个类的所有子类
 * http://stackoverflow.com/questions/492184/how-do-you-find-all-subclasses-of-a-given-class-in-java
 */
public class SubClassFinder {

    /**
     * 获取一个类的所有子类
     * @param clazz 需要获取的类的class
     * @param basePackage 起始的包
     * @param afterFind 找到之后处理的事情
     * @throws ClassNotFoundException
     */
//    public void getAllSubClass(Class clazz, String basePackage, Consumer<Class> afterFind) throws ClassNotFoundException {
//        ClassPathScanningCandidateComponentProvider provider = new ClassPathScanningCandidateComponentProvider(true);
//        provider.addExcludeFilter(new AssignableTypeFilter(clazz));
//
//        Set<BeanDefinition> components = provider.findCandidateComponents(basePackage);
//        System.out.println(components.size());
//        for (BeanDefinition component : components) {
//            Class cls = Class.forName(component.getBeanClassName());
//            afterFind.accept(cls);
//        }
//    }
}
