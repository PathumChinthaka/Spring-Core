package lk.ijse.gdse.springcore.config;

import lk.ijse.gdse.springcore.bean.MyBean;
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
}
