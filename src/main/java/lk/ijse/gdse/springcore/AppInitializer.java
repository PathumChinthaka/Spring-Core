package lk.ijse.gdse.springcore;

import lk.ijse.gdse.springcore.bean.*;
import lk.ijse.gdse.springcore.config.ApplicationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.register(ApplicationConfig.class);
        context.refresh();

        //call the testBean concern inside mybean class
//        MyBean bean = context.getBean(MyBean.class);
//        bean.testBean();

        //get bean classes from Spring Application context
//        System.out.println(context.getBean(MyBean.class));
//        System.out.println(context.getBean(MYBeanTwo.class));

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
//        Object bean1 = context.getBean("myBean");
//        System.out.println(bean1);

        //change default bean id
//        Object bean3 = context.getBean("SpringBeanThree");
//        System.out.println(bean3);

        //get bean id from the class i didnt define
        //this is not the correct way to access the bean id

//        MyConnection myConnection = (MyConnection) context.getBean("myConnection");
//        System.out.println(myConnection);

        //if we use @Bean annotation we cannot access the bean id from class Name
        // we should provide the method name inside the config class

//        MyConnection myConnection1= (MyConnection) context.getBean("getConnection");
//        System.out.println(myConnection1);

        //We can shut down Application context like this (automatically shut down Application context)
        context.registerShutdownHook();

        // Application context is not create new bean instance always
        // all bean class instance create only one time and save them inside Application context.
        // and provide them on our request

//        MyBean bean = context.getBean(MyBean.class);
//        MyBean bean1 = context.getBean(MyBean.class);
//        MyBean bean2 = context.getBean(MyBean.class);

// if i change the mybean class scope @Scope("prototype") this class will always returns new instance

//        System.out.println(bean);
//        System.out.println(bean1);
//        System.out.println(bean2);

// At this point bean class will create an object because developer requested it like this

//        BeanLifecycle bean = context.getBean(BeanLifecycle.class);
//        System.out.println(bean);

    }
}
