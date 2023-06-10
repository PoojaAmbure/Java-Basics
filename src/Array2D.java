import java.util.*;
public class Array2D {
    public static void main(String[] args) {
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
            for ( int j = 0 ; j < a[i].length ; j++ ) {
                System.out.print( result[ i ][ j ] + " ");
                result[i][j] = a[i][j] + b[i][j];
            }
            System.out.println();
        }
    }
}