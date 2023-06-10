
class MyNewThre1 extends Thread {
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("Thank u =" + this.getName());
            i++;
        }
    }
}
    class MyNewThre2 extends Thread {
        public void run() {
            while (true) {
                System.out.println("My....Thank u ");
                try {
                    Thread.sleep(455);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }

    public class ThreadMethods {
        public static void main(String[] args) {

            MyNewThre1 t1 = new MyNewThre1();
            MyNewThre2 t2 = new MyNewThre2();
            t1.start();
            try {
                t1.join();
            } catch (Exception e) {
                System.out.println(e);
            }
            t2.start();
        }
     }