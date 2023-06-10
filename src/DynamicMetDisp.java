
class Phone{
    public void great(){
        System.out.println("Good Morning...!!!");
    }

    public void name(){
        System.out.println("My name is Java");
    }
}
class SmartPhone extends Phone {
    public void swagat(){
        System.out.println("Apka swagat hai...!!");
    }
    public void name() {
        System.out.println("My name is Java in class two");
    }
}
public class DynamicMetDisp {
    public static void main(String[] args) {
        //Phone obj = new Phone();
        //SmartPhone sobj=new SmartPhone();

        Phone obj = new SmartPhone(); //Run Time polymorphism
        obj.great();
        obj.name();

    }
}
