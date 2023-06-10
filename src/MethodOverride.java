
class A{
    public int a;
    public int pooj(){
        return 1111;
    }
    public void math2(){                    //no parameters override
        System.out.println("I am method 2 of class A");
    }
}
class B extends A{

    @Override
    public void math2() {                   //no parameters override ..."I param overloadding"
        System.out.println("I am method 2 of class B");
    }
    public void math3(){
        System.out.println("I am method 3 of class B");
    }
}
public class MethodOverride {
    public static void main(String[] args) {
        A ao = new A();
        ao.math2();

        B bo = new B();
        System.out.println(bo.pooj());

        bo.math2();
    }
}
