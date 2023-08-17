package lk.ijse.gdse.springcore.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//consider as a bean class
//@Component

//default scope of a bean class is singleton(return only one instance) but we can change this scope
@Scope("prototype")
//now this bean class always create new instance inside the application context

public class MyBean {
    public MyBean(){
        System.out.println("Spring bean object created");
    }

    public void testBean(){
        System.out.println("Test bean consern working");
    }
}
