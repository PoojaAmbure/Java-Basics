import java.util.*;
public class Leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year=");
        int yr = sc.nextInt();

        if(yr % 4 == 0)
        {
            System.out.println("Given year is a leap year");
        }
        else {
            System.out.println("Not a leap year");
        }
    }

}