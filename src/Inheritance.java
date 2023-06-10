
class Base {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting X now");
        this.x = x;
    }

    public void printMe() {
        System.out.println("I am a Constructor");
    }
}
    class Derive extends Base{
        int y;

        public int getY() {
            return y;
        }

        public void setY(int y) {
            System.out.println("I am in Derived class now");
            this.y = y;
        }
    }

public class Inheritance {
    public static void main(String[] args) {
        Base b=new Base();
        b.setX(4);
        System.out.println(b.getX());


        Derive d = new Derive();
        d.setX(5);
        System.out.println(d.getX());

        d.setY(8);
        System.out.println(d.getY());
    }
}

