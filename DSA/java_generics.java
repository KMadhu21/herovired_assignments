import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Object[] obj={1,2,3,"Hello","World"};
        printArray(obj);
}

    public static void printArray(Object[] arr)
    {
        for(Object i :arr)
        {
            System.out.println(i);
        }
    }
}