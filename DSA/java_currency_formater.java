import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double payment = sc.nextDouble();
    String us,india,china,france;
    us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
    india = NumberFormat.getCurrencyInstance(new Locale("EN","IN")).format(payment);
    china= NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
    france= NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
    
    System.out.println("US: " + us);
    System.out.println("India: " + india);
    System.out.println("China: " + china);
    System.out.println("France: " + france);
    sc.close();
}
}