package lk.ijse.gdse.springcore.bean.dependencyinject;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component

public class Women implements GoodWomen {
    public Women(){
        System.out.println("women Instantiated");
    }

    @Override
    public void chat() {
        System.out.println("women chatting");
    }
}
