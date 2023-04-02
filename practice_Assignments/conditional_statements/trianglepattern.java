public class trianglepattern {
    public static int n=1;
    public static void main(String[] args) {
        int num=3; 
            for(int i=0;i<num;i++){
                for(int j=0;j<n;j++)
                System.out.print("* ");
                n+=2;
                System.out.println();
            }
            n-=4;
            for(int i=0;i<num-1;i++){
                
                for(int j=0;j<n;j++)
                System.out.print("* ");
                n-=2;
                System.out.println();
            }
    }
}
