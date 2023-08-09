package lk.ijse.gdse.springcore;

import lk.ijse.gdse.springcore.config.ApplicationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.register(ApplicationConfig.class);
        context.refresh();
        context.close();
    }
}
