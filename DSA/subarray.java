import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count=0; 
        for (int i = 0 ; i < n ; i++){ 
            arr[i] = sc.nextInt();
            
        }  
        for(int i = 0 ;i< n ; i++) { 
             int sum =0; 
            for (int j = i; j < arr.length;j++){
                sum += arr[j];
                if (sum <0){
                
                    count++;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}