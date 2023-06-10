import java.util.*;

public class PractSet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sub 1 mks = " );
        byte a= sc.nextByte();

        System.out.println("Enter sub 2 mks = " );
        byte b= sc.nextByte();

        System.out.println("Enter sub 2 mks = " );
        byte c= sc.nextByte();

        float avg = (a + b+ c)/3.0f;
        System.out.println("total mks scored=  " +avg );

        if(avg >= 40 && a>=33 && b>=33  &&  c>=33){
            System.out.println("Congrats U r passed");
        }
        else {
            System.out.println("Sry U r failed");
        }
    }

}
