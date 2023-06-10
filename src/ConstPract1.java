
class ConstCyl{
    private int rad;
    private int height;

    public int getRad() {
        return rad;
    }

    public void setRad() {
        this.rad = rad;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public ConstCyl(int rad, int height) {
        this.rad = rad;
        this.height = height;
    }
}

public class ConstPract1 {
    public static void main(String[] args) {
        ConstCyl crl= new ConstCyl(9,12);

        System.out.println("The radius is=" + crl.getRad());
        System.out.println("The height is=" + crl.getHeight());
    }
}
