import java.io.*;
import java.math.*;
import java.util.*;
public class Solution {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[][] = new int[6][6];
        for(int i = 0 ; i < 6 ; i++)
            for(int j = 0 ; j < 6 ; j++)
                array[i][j] = sc.nextInt();
        sc.close();
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < 4 ; i++ ) {
            for(int j = 0 ; j < 4 ; j++)
                max= Math.max(max, hour(array,i,j));
        }
        System.out.println(max);
    }
    public static int hour(int array[][],int i,int j) {
        int sum = 0;
        if(i < 4 && j < 4) {
            for(int a = i ; a < i+3 ; a++) {
                for(int b = j ; b < j+3 ; b++) {
                    sum += array[a][b];
                }
            }
            sum  = sum-array[i+1][j]-array[i+1][j+2];
        }
        return sum;
    }
}