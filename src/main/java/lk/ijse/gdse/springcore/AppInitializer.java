package lk.ijse.gdse.springcore;

import lk.ijse.gdse.springcore.bean.MYBeanThree;
import lk.ijse.gdse.springcore.bean.MYBeanTwo;
import lk.ijse.gdse.springcore.bean.MyBean;
import lk.ijse.gdse.springcore.config.ApplicationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.register(ApplicationConfig.class);
        context.refresh();

        //call the testBean concern inside mybean class
        MyBean bean = context.getBean(MyBean.class);
        bean.testBean();

        //get bean classes from Spring Application context
        System.out.println(context.getBean(MyBean.class));
        System.out.println(context.getBean(MYBeanTwo.class));

//      context.close();

//      Error because we have already closed the context
//      System.out.println(context.getBean(MYBeanThree.class));

        //Hooking process in java

//        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
//            @Override
//            public void run() {
//                //we must shout down the Applicatin context while Jvm is About to shut Down
//                context.close();
//                System.out.println("Shut down Application context");
//            }
//        }));

        //get bean Id from Application context
        //MyBean->myBean First letter should be lowerCase
        Object bean1 = context.getBean("myBean");
        System.out.println(bean1);

        //change default bean id
        Object bean3 = context.getBean("SpringBeanThree");
        System.out.println(bean3);

        //We can shut down Application context like this (automatically shut down Application context)
        context.registerShutdownHook();

    }
}
