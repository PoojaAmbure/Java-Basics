import java.util.*;
class Cylinder{

    private int rad ;
    private int height;

    public int getRad(){
        return rad;
    }
    public void setRad(int rad){
       this.rad = rad;
    }
    public int getHeight(){
        return height;
    }

    public void setHeight(int height){
        this.height = height;
    }
    public double surfaceArea(){
        return 2*3.14*rad*rad *2*3.14*rad*height;
    }
    public double Vol(){
        return 3.14*rad*rad*height;
    }


}
public class ConstPract {
    public static void main(String[] args) {
        Cylinder cr = new Cylinder();
        cr.setRad(12);
        int h =cr.getRad();
        System.out.println("The radius is =" + h);

        cr.setHeight(6);
        cr.getHeight();
        System.out.println("The Height is =" + cr.getHeight());
        System.out.println("The Surface area is =" + cr.surfaceArea());
        System.out.println("The Volume is =" + cr.Vol());
    }

}
