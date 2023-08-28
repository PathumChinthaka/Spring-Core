package lk.ijse.gdse.springcore.config;

import lk.ijse.gdse.springcore.bean.MyBean;
import lk.ijse.gdse.springcore.bean.dependencyinject.InterBeanOne;
import lk.ijse.gdse.springcore.bean.dependencyinject.InterBeanTwo;
import lk.ijse.gdse.springcore.bean.fullmode.MyBasicDataSource;
import lk.ijse.gdse.springcore.bean.fullmode.MyConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//Source for a bean definition
@Configuration
@ComponentScan(basePackages = "lk.ijse.gdse.springcore.bean")
public class ApplicationConfig {

    //If we introduce spring beans to the application context via Spring
    //Configuration class with @Bean methods it mean Spring Full mode

    @Bean
    public MyBasicDataSource basicDataSource(){

        //inter bean dependency
        MyConnection myConnection=connection();

        System.out.println(myConnection);

        MyBasicDataSource myBasicDataSource=new MyBasicDataSource();
        myBasicDataSource.setMyConnection(myConnection);

        return myBasicDataSource;
    }

    @Bean
    public MyConnection connection(){
        return new MyConnection();
    }
}
