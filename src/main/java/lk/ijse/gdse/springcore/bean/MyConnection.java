package lk.ijse.gdse.springcore.bean;

import org.springframework.beans.factory.DisposableBean;

public class MyConnection implements DisposableBean {
    public MyConnection(){
        System.out.println("Imagin this class is not created by You MyConnection");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("MyConnection object destroied");
    }
}
