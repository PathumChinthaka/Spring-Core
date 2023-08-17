package lk.ijse.gdse.springcore.bean;

import org.springframework.stereotype.Component;

//customize bean id
//@Component("SpringBeanThree")

//default bean id-MYBeanThree
public class MYBeanThree {
    public MYBeanThree(){
        System.out.println("My Bean Three Object Created");
    }
}
