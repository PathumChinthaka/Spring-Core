package lk.ijse.gdse.springcore.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component

//@Scope("prototype")
public class BeanSteps implements BeanNameAware,
        BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean
{

    public BeanSteps(){
        System.out.println("Bean Instantiated");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Set Bean Name");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(" Set Bean Factory Aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application context aware");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initialize bean called and bean is ready to use");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Finally Bean destroyed");
    }

    //if i changed the scope to prototype the destroy method will not invoke
    //beacause prototype beans are create outside from the Applicationcontext
}
