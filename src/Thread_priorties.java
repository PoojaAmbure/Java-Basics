
class MYThre1 extends Thread{
    public MYThre1(String name) {
        super(name);
    }
    public void run(){
        //while (true){
        System.out.println("Thank u =" + this.getName());
    }
}

public class Thread_priorties {
    public static void main(String[] args) {

        MYThre1 mt = new MYThre1("Pooja1111");
        MYThre1 mt2 = new MYThre1("Shaurya1111");
        MYThre1 mt3 = new MYThre1("Tina");
        MYThre1 mt4 = new MYThre1("Shrutika");
        MYThre1 mt5 = new MYThre1("Akshada(Most Impoertant)");

        mt.start();
        mt2.start();
        mt3.start();
        mt4.start();
        mt5.start();
    }
}