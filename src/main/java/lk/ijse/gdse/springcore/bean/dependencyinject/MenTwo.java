package lk.ijse.gdse.springcore.bean.dependencyinject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component

public class MenTwo {

    GoodWomen women;

    @Autowired
    //Constructor through dependency injection
    public MenTwo(GoodWomen w){
        this.women=w;
        System.out.println("Men Two Instantiate");
    }

    public void chatWithWomen(){
        women.chat();
    }
}
