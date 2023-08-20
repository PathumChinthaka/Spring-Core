package lk.ijse.gdse.springcore.bean.dependencyinject;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//primary annotation get more priority during dependency injection
//@Primary
public class WomenTwo implements GoodWomen {

    public WomenTwo(){
        System.out.println("Woment 2 instatiates");
    }

    @Override
    public void chat() {
        System.out.println("Women 2 chatting");
    }
}
