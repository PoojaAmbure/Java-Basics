
class cir{
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double area(){
        return 3.14 * radius * radius ;
    }
}
class Cylinder1 extends cir{
   private int rad1;
   private int hei1;

    public int getRad1() {
        return rad1;
    }

    public void setRad1(int rad1) {
        this.rad1 = rad1;
    }

    public int getHei1() {
        return hei1;
    }

    public void setHei1(int hei1) {
        this.hei1 = hei1;
    }

    public double volu(){
        return 3.14 * rad1 * rad1 * hei1;
    }
}
public class Circle {
    public static void main(String[] args) {

        Cylinder1 cr = new Cylinder1();
        //circle
        cr.setRadius(5);
        System.out.println("The radius of circle is=" + cr.getRadius());

        System.out.println("The area of circle is= " + cr.area());

        System.out.println();

        //Cylinder
        cr.setRad1(8);
        System.out.println("The length of rectangle is=" + cr.getRad1());

        cr.setHei1(5);
        System.out.println("The height of rectangle is=" + cr.getHei1());

        System.out.println("The volume of cylinder is =" + cr.volu());
    }
}