import java.util.*;

public class Elif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age > 45){
            System.out.println("U are Experienced");
        }
        else if (age >  35)
        {
            System.out.println("U are semi experienced");
        }
        else if(age > 25)
        {
            System.out.println("U are well experienced");
        }
        else{
            System.out.println("U arev not experienced");
        }
    }
}
