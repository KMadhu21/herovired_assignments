import java.util.*;

public class Solution {

   public static boolean winning(int leap, int[] game) {
    return solve( leap, game, 0);    
}

public static boolean solve (int leap, int[] game, int i){
    if ( i >= game.length){
        return true;
    }
    if ( i<0 || game[i] ==1){
        return false;
    }
    game[i] = 1;

    return solve(leap, game, i + leap) || solve(leap, game, i + 1) || solve(leap, game, i - 1);
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int queries = sc.nextInt();
    while (queries-- > 0)
     {
        int n = sc.nextInt();
        int leap = sc.nextInt();

        int[] game = new int[n];
        for (int i = 0; i < n; i++) 
        {
            game[i] = sc.nextInt();
        }

        System.out.println( (winning(leap, game)) ? "YES" : "NO" );
    }
    sc.close();
}
}