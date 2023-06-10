
class Rectang{
    private int l;
    private int b;

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}

class Cuboid extends Rectang{
    private int length1;
    private int width1;
    private int height1;

    public int getLength1() {
        return length1;
    }

    public void setLength1(int length1) {
        this.length1 = length1;
    }

    public int getWidth1() {
        return width1;
    }

    public void setWidth1(int width1) {
        this.width1 = width1;
    }

    public int getHeight1() {
        return height1;
    }

    public void setHeight1(int height1) {
        this.height1 = height1;
    }
}
public class Rect1 {
    public static void main(String[] args) {

        Cuboid cub = new Cuboid();
        cub.setL(6);
        System.out.println("The length is=" + cub.getL());

        cub.setB(4);
        System.out.println("The Breadth is=" + cub.getB());

        cub.setLength1(9);
        System.out.println("The length of cuboid is=" + cub.getLength1());

        cub.setWidth1(8);
        System.out.println("The width of cuboid is=" + cub.getWidth1());

        cub.setHeight1(7);
        System.out.println("The height of cuboid is=" + cub.getHeight1());
    }
}
