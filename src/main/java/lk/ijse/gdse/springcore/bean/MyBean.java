package lk.ijse.gdse.springcore.bean;

import org.springframework.stereotype.Component;

@Component
public class MyBean {
    public MyBean(){
        System.out.println("Spring bean object created");
    }
}
