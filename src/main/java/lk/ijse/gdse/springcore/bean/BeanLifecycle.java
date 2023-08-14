package lk.ijse.gdse.springcore.bean;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

//default the bean class scope is singleton it will create an object exately

//if we change the scope like this this will create an object only developer request it
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BeanLifecycle {
    public BeanLifecycle(){
        System.out.println("Bean Lifecycle");
    }
}
