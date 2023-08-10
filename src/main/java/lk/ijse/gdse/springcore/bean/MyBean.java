package lk.ijse.gdse.springcore.bean;

import org.springframework.stereotype.Component;

//consider as a bean class
@Component

public class MyBean {
    public MyBean(){
        System.out.println("Spring bean object created");
    }

    public void testBean(){
        System.out.println("Test bean consern working");
    }
}
