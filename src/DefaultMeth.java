
interface Camera{
    void takeSnap();
    void recordVdo();
}

interface wifi{
    String[] getNet();
    void conctToNet();
}

class MyCellPhone{
    void callNum(int phnum){
        System.out.println("Calling..." + phnum);
    }
}

class Cellphone{
void takeSnap(){
    System.out.println("Taking Snap...");
  }
}
public class DefaultMeth {

}
