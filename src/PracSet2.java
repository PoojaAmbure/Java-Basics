import java.util.*;

public class PracSet2 {
    // Q 1

    public static void main(String[] args) {
       /* int n =4;
        for(int i =1 ; i<=n ; i++)
        {
            for (int j =4; j>=i; j--)
            {
                System.out.print('*');

            }
            System.out.println();
        } */
       /*int n=0, sum=0;
       while(n<10){
           sum= sum+ 3;
           System.out.println(sum);
           n++;
       }*/
       /*int n=5;
       for(int i=1 ; i<=10; i++)
           System.out.printf("%d x %d = %d \n" , n, i, n * i);*/

        /*int n=4;
        for(int i=10 ; i>=0; i--)
            System.out.printf("%d x %d = %d \n" , n, i, n * i);*/

        int n=5;
        int i = 1;
        int fact = 1;
        while (i<= n)
        {
            fact *= i;
            i++;
        }

        System.out.println(fact);
    }
}
