
abstract class Pen {
    abstract void write();

    abstract void refill();
}
    class FountPen extends Pen {
        void write() {
            System.out.println("Write..!");
        }

        void refill() {
            System.out.println("Refill..!");
        }

        void changeNib() {
            System.out.println("Changing the nib");
        }
    }

    public class PractSet7 {
        public static void main(String[] args) {
            FountPen pen = new FountPen();
            pen.changeNib();
        }
    }


