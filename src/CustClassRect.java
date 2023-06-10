import java.util.*;
class Rectangle{
    int len;
    int breadth;

    public int area(){
        return len * breadth;
    }

    public int param(){
        return 2* len * breadth;
    }
}

public class CustClassRect {
    public static void main(String[] args) {
    Rectangle rec = new Rectangle();
    rec.len=8;
    rec.breadth=5;
    rec.area();
        System.out.println("The area of rectangle is= " + rec.area());
    rec.param();
        System.out.println("The Parameter of Rect is = " + rec.param());
    }
}