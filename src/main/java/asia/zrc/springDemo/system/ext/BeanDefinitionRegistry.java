package asia.zrc.springDemo.system.ext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;

/**
 * Created by zrc on 2017/3/24.
 */
public class BeanDefinitionRegistry implements BeanDefinitionRegistryPostProcessor {
	/**
	 * 在spring 初始化完成之后，可以通过和这个方法修改applicationContex 中的bean
	 * @param beanDefinitionRegistry
	 * @throws BeansException
	 */
	@Override
	public void postProcessBeanDefinitionRegistry(
		org.springframework.beans.factory.support.BeanDefinitionRegistry beanDefinitionRegistry)
		throws BeansException {

	}

	/**
	 *
	 * @param configurableListableBeanFactory
	 * @throws BeansException
	 */
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory)
		throws BeansException {

	}
}
