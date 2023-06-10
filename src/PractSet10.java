import java.util.Scanner;

public class PractSet10 {

    public static void main(String[] args) {

        try {
                int a =666/0;
        }catch (IllegalArgumentException e){
            System.out.println("Hahaha");
        }
        catch (ArithmeticException e){
            System.out.println("Hihihi");
        }

        //problem 3
        boolean flag = true;
        int mks[] = new int[3];
        mks[0]= 75;
        mks[1]= 65;
        mks[2]= 55;
        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;
        while (flag  && i<5) {
            try {
                System.out.println("enter the value of index");
                index = sc.nextInt();
                System.out.println("The value of mks[index] is =" + mks[ index ]);
                break;
            }
            catch (Exception e){
                i++;
                System.out.println("Invalid Index");
            }
        }
    }
}
