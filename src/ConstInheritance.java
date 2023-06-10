
class Base1{
    public Base1() {
        System.out.println("I am a Constructor");
    }
    public Base1(int a) {
        System.out.println("I am an overloaded Constructor with value = " +a);
    }

    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class Derived1 extends Base1{
    public Derived1() {
        super(0);
        System.out.println("I am a derived class constructor");
    }

    public int y;
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class ConstInheritance {
    public static void main(String[] args) {
        //Base1 b = new Base1();
        Derived1 d = new Derived1();
    }
}
