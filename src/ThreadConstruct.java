
class MYThre extends Thread{
    public MYThre(String name) {
        super(name);
    }
    public void run(){
        //while (true){
            System.out.println("I am a thread...");
        }
    }

public class ThreadConstruct {
    public static void main(String[] args) {
        MYThre mt = new MYThre("Pooja1111");
        MYThre mt2 = new MYThre("Shaurya1111");


        mt.start();
        mt2.start();
        System.out.println("The id of the Thread is =" + mt.getId());
        System.out.println("The name of the Thread is =" + mt.getName());
        System.out.println("The name of the Thread is =" + mt2.getName());

    }
}
