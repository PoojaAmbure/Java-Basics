import java.util.*;
public class PractSet4 {
    /*public static void Tab(int n){
        for(int i=1; i<=10;i++) {
            int tab = n * i;
            System.out.format("%d x %d = %d \n" , n ,i ,tab);
        }
        //System.out.println();
    }*/

    public static void printSum(int i, int n, int sum) {
        if (i == n) {
            sum = sum + i;
            System.out.println(sum);
            return;
        }
        sum = sum + i;
        printSum(i + 1, n, sum);
    }

    public static void main(String[] args) {


        //Tab(7);
        /*int n =4;
        for ( int i=1; i<=n; i++){
            for ( int j=1; j<=i; j++ ){
                System.out.print("*");
            }
            System.out.println();*/

        printSum(1,5,0);
        }
    }
