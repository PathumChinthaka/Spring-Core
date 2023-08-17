package lk.ijse.gdse.springcore.bean.dependencyinject;

public class Men {

//--------property inject---------

//    Women women=new Women();

//-------constructor injection--------

//      Women women;
//
//      public Men(Women women){
//          this.women=women;
//      }

//--------setter method inject---------

//    public void setWomen(Women women){
//        this.women=women;
//    }

    public void chatWithWomen(){
        Women women=new Women();
        //tight coupling
        women.chat();
    }
}
