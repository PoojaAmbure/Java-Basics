
class abc extends Thread{
    public void run() {
        while (true) {
            System.out.println("Good morning....!!!");
            try {
                Thread.sleep(200);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

class abc1 extends Thread{
    public void run() {
        while (true) {
            System.out.println("Welcome..!");
            try {
                Thread.sleep(200);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
public class ThreadPrac1 {
    public static void main(String[] args) {
        abc a= new abc();
        a.setPriority(6);
        System.out.println(a.getPriority());
        System.out.println(a.getState());
        a.start();

        abc1 ab= new abc1();
        ab.setPriority(9);
        System.out.println(ab.getPriority());
        System.out.println(ab.getState());
        ab.start();
    }
}
