
import java.util.*;

abstract class Parent{
    public Parent() {
        System.out.println("I am a constructor at base 2");
    }

    public void sayHello(){
        System.out.println(" Hello....!!! ");
    }
    abstract public void greet();   //Parent object cannot be made cauz its a abstract class
}
class child2 extends Parent{        // child2 obj can be made as its a concrete class of parent class
    public void greet(){
        System.out.println(" Good Morning....!!! ");
    }
}
abstract class child3 extends Parent {
    public void th() {
        System.out.println(" I am good....!!! ");
    }
}
public class AbstractExample {
    public static void main(String[] args) {

        child2 ch = new child2();
        ch.sayHello();
        ch.greet();
    }
}
