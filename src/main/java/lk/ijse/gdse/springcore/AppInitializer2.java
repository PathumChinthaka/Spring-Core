package lk.ijse.gdse.springcore;

import lk.ijse.gdse.springcore.config.ApplicationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class AppInitializer2 {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(ApplicationConfig.class);
        context.refresh();

        //We can shut down Application context like this (automatically shut down Application context)
        context.registerShutdownHook();

        Map<String, String> getenv = System.getenv();
        for(String key:getenv.keySet()){
            System.out.println(key+":"+getenv.get(key));
        }

    }
}
