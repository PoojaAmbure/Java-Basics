import java.util.*;

class Square{
    int side;
    public int area(){
        return side * side;
    }
    public int parameter(){
    return 4* side;
    }
}

public class CustClassSqu {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.side=3;
        sq.area();
        System.out.println("The area of circle is=" + sq.area());
        sq.parameter();
        System.out.println("The Param is=" +sq.parameter());
    }
}
