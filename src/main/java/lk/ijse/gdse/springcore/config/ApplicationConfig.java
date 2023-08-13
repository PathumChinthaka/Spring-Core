package lk.ijse.gdse.springcore.config;

import lk.ijse.gdse.springcore.bean.MyBean;
import lk.ijse.gdse.springcore.bean.MyConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

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

    @Bean
    public MyConnection getConnection(){
        return new MyConnection();
    }
}
