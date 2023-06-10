
interface Bicycle{
    int a =1111;
    String b="Pooja";
    void applyBreak(int decre);
    void speedUp(int incre);
}
class Herculas implements Bicycle{

    void blowHorn(){
        System.out.println("Peepppp.....!!!");
    }
   public void applyBreak(int decre){
        System.out.println("Applying Break....!!!");
    }
   public void speedUp(int incre){
        System.out.println("SpeedUp bro...!!");
    }
}

public class InterfExamp {
    public static void main(String[] args) {
        Herculas h = new Herculas();
        h.applyBreak(1);
        System.out.println(h.a);
        System.out.println(h.b);
    }
}