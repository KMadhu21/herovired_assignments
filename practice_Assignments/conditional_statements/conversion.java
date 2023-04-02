import java.util.*;
public class conversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch;
        do{
            System.out.println("\nMenu based app - Unit conversion for Distance\n1.CM to M\n2.M to KM\n3.KM to M\n4.M to CM");
            System.out.print("Enter your menu - ");
            int n=sc.nextInt();
            System.out.print("Please enter the CM Value: ");
            double val=sc.nextDouble();
            if(n==1){
                System.out.printf("%d CM = %.2f M\n",(int)val,(val/100));
            }
            else if(n==2)
            {
                System.out.printf("%.2f M = %.2f KM\n",val,(val/1000));
            }
            else if(n==3){
                System.out.printf("%.2f KM = .%2f M\n",val,(val*1000));
            }
            else if(n==4)
            {
                System.out.printf("%.2f M = %.2f CM\n",val,(val*100));
            }
            else{
                System.out.println("Invalid Choice");
            }
            System.out.print("Do you want to Continue:");
            ch=sc.next().charAt(0);
        }while(ch=='y'||ch=='Y');
        sc.close();
    }
}
