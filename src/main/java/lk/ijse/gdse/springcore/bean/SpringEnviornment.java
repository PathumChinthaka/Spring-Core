package lk.ijse.gdse.springcore.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringEnviornment implements InitializingBean {

    //i got username from os and set the value to name
    @Value("${user.name}")
    private String name;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(name);
    }
}
