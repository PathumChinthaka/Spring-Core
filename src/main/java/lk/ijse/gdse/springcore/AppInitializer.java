package lk.ijse.gdse.springcore;

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
        System.out.println(bean);
        bean.testBean();

        context.close();
    }
}
