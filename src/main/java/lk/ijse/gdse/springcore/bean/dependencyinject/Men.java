package lk.ijse.gdse.springcore.bean.dependencyinject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class Men {

    //target the sub class for DI process
    @Qualifier("womenTwo")

    @Autowired
    GoodWomen women;

    public Men(){
        System.out.println("bean men instatiated");
    }

    public void chatWithWomen(){
        women.chat();
    }
}
