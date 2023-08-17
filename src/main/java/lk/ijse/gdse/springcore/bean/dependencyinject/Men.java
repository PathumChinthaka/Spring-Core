package lk.ijse.gdse.springcore.bean.dependencyinject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Men {

    @Autowired
    Women women;

    public Men(){
        System.out.println("bean men instatiated");
    }

    public void chatWithWomen(){
        women.chat();
    }
}
