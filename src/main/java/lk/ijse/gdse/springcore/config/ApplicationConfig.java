package lk.ijse.gdse.springcore.config;

import lk.ijse.gdse.springcore.bean.MyBean;
import lk.ijse.gdse.springcore.bean.MyConnection;
import lk.ijse.gdse.springcore.bean.dependencyinject.InterBeanOne;
import lk.ijse.gdse.springcore.bean.dependencyinject.InterBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//Source for a bean definition
@Configuration

//Scan POJO s and push into the ApplicationContext
//@ComponentScan(basePackages = "lk.ijse.gdse.springcore.bean")

//Refactor Freindly
@ComponentScan(basePackageClasses = {MyBean.class})

public class ApplicationConfig {
    public ApplicationConfig(){
        System.out.println("Application Config");
    }

    //how to include a class(not defined by you) into the Application context

    // step 1 : create a method returns a new instance from class name
    // step 2: add @bean annotation

//    @Bean
    //change scope to prototype it will create new instance if developer request it
//    @Scope("prototype")
//    public MyConnection getConnection(){
//        return new MyConnection();
//    }

    //Inter bean dependency

    @Bean
    public InterBeanOne getInterBeanOne(){
        //inter bean dependency

        InterBeanTwo interBeanTwo=getInterBeanTwo();
        InterBeanTwo interBeanTwo1=getInterBeanTwo();

        System.out.println(interBeanTwo);
        System.out.println(interBeanTwo1);
        return new InterBeanOne();
    }

    @Bean
    //this method is invoking first and push the object to Application context
    // beacause i requested an instance inside inter bean one method
    public InterBeanTwo getInterBeanTwo(){
        return new InterBeanTwo();
    }
}
