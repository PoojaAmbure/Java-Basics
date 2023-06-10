
public class Jmethods {

        static int logic(int x, int y){
            int z;
            if(x>y) {
                z= x+y;
            }
            else {
                z=(x + y)*5;
            }
            return z;
        }
    public static void main(String[] args) {
        int a=8;
        int b=9;
        int c=logic(a,b);
        System.out.println(c);

        int a1=25;
        int b1= 28;
        int c1=logic(a1,b1);
        System.out.println(c1);

    }
}
