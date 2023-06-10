import java.util.*;
public class Calcu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter mks of Sub 1=");
        int a = sc.nextInt();

        System.out.print("Enter mks of Sub 2=");
        int b = sc.nextInt();

        System.out.print("Enter mks of Sub 3=");
        int c = sc.nextInt();

        System.out.print("Enter mks of Sub 4=");
        int d = sc.nextInt();

        System.out.print("Enter mks of Sub 5=");
        int e = sc.nextInt();

        int tot = a + b + c + d + e;
        System.out.println("The Total is := " + tot);
        float per = (tot*100)/500;
        System.out.println("The percentage is :=" +per);
    }
}
