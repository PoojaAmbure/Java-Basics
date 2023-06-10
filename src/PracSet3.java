import java.util.*;
public class PracSet3 {
    public static void main(String[] args) {

        //float mks[]= {65.25f, 95.36f ,85.4f,75.42f ,80.62f};

        //Q2
        /*float sum= 0;
        for (float element : mks) {
            sum = sum + element;
        }
        System.out.println(sum);*/

        //Q2
        /*float num= 95.36f;
        boolean isInArray = false;

        for (float element : mks) {
            if(num == element){
                isInArray = true;
                break;
            }
        }
        if (isInArray){
            System.out.println("The value is present in Array");
        }
        else{
            System.out.println("Not present in Array");
        }*/


        //Q3
        /*float sum= 0;
        float avg=0;
        for (float element : mks) {
            sum = sum + element;
             avg = sum/mks.length;

        }
        System.out.println(sum);
        System.out.println(avg);*/
/*
        int[][] a = {{1, 3, 5},
                {8, 6, 4}};
        int[][] b = {{2, 8, 4},
                {6, 7, 3}};
        int[][] result = {{0, 0, 0},
                {0, 0, 0}};

        for ( int i = 0 ; i <= a.length ; i++ ){
            for ( int j = 0 ; j < a[ i ].length ; j++ ) {
                System.out.format("Setting value of i = %d  and j = %d\n", i, j);
                result[ i ][ j ] = a[ i ][ j ] + b[ i ][ j ];
            }
        }
        for(int i=0; i <= a.length ; i++){
        for ( int j = 0 ; j < a[ i ].length ; j++ ) {
            System.out.print( result[ i ][ j ] + " ");
            result[ i ][ j ] = a[ i ][ j ] + b[ i ][ j ];
        }
        System.out.println();
    }*/

// Reversing array
    int arr[] = {45,65,95,75,85,55};
    /*int l = arr.length;
    int n = Math.floorDiv(l ,2);
    int temp;

    for(int i=0; i<n; i++){
        temp = arr[i];
        arr[i]= arr[l-i-1];
        arr[l-i-1]= temp;
    }
    for (int element: arr ){
        System.out.print(element + " ");
        }
        System.out.println();*/

    int max =0;
    for(int e: arr){
        if(e>max){
            max=e;
        }
    }
        System.out.println("max is=" + max);


        int min=100;
        for(int e: arr){
            if(e<=min){
                min=e;
            }
        }
        System.out.println("min is=" + min);
    }
}
