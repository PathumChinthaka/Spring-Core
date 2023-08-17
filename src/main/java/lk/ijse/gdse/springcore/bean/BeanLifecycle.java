package lk.ijse.gdse.springcore.bean;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component

//default the bean class scope is singleton it will create an object exately

//if we change the scope like this this will create an object only developer request it
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BeanLifecycle {
    public BeanLifecycle(){
        System.out.println("Bean Lifecycle");
    }

    //bean Lifecycle steps 8 //

    // Instantiation:
    // At this stage, the bean is created, often by invoking its constructor or a factory method.
    // The container creates an instance of the bean class.
    //---------------------------------------------------
    // Population of Properties:
    // After the bean is created, its properties are set.
    // These properties can be set through constructor arguments or using setters, often using values configured in XML files, Java configuration classes, or annotations.
    //---------------------------------------------------
    // Initialization:
    // Once the properties are populated, the bean's initialization methods are called.
    // These methods can be annotated with @PostConstruct or can implement the InitializingBean interface. Custom initialization logic can be executed here.
    //---------------------------------------------------
    // Dependency Injection:
    // If the bean has dependencies on other beans, these dependencies are injected at this stage.
    // This is a crucial aspect of the inversion of control (IoC) principle, which is a central concept in frameworks like Spring.
    //---------------------------------------------------
    // Bean is Ready for Use:
    // After dependency injection, the bean is now fully configured and ready to be used by the application.
    //---------------------------------------------------
    // Usage:
    // The bean is used as needed during the course of the application's runtime.
    //---------------------------------------------------
    // Destruction:
    // When the application is shutting down or when the bean is no longer needed, its destruction methods are called.
    // These methods can be annotated with @PreDestroy or can implement the DisposableBean interface.
    // Custom cleanup logic can be executed here.
    //---------------------------------------------------
    // Garbage Collection:
    // After the bean is destroyed, it becomes eligible for garbage collection by the Java Virtual Machine
}
