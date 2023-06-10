
class Rectangle1{
    private int len;
    private int breadth;

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public Rectangle1(int len, int breadth) {
        this.len = len;
        this.breadth = breadth;
    }
}

public class ConstRect {
    public static void main(String[] args) {
        Rectangle1 rec = new Rectangle1(4 , 5);
        System.out.println("The length is=" + rec.getLen());
        System.out.println("The Breadth is=" + rec.getBreadth());
    }
}
