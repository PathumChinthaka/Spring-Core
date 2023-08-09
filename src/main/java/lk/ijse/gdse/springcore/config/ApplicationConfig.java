package lk.ijse.gdse.springcore.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.gdse.springcore.bean")
public class ApplicationConfig {
    public ApplicationConfig(){
        System.out.println("Application Config");
    }
}
