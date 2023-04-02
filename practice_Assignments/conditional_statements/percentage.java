import java.util.*;
public class percentage {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the obtained marks:");
    int obtainedmarks=sc.nextInt();
    System.out.println("Enter the Total marks :");
    int totalmarks=sc.nextInt();
    double per=(double)obtainedmarks/totalmarks;
    double cgpa;
    char grade;
    per=(double)(per*100);
    if(per>=90 && per<=100)
    {
        cgpa=4.0;
        grade='A';
    }
    else if(per>=80 && per<=89){
        cgpa=3.0;
        grade='B';
    }
    else if(per>=70 && per<=79){
        cgpa=2.0;
        grade='C';
    }
    else if(per>=60 && per<=69){
        cgpa=1.0;
        grade='D';
    }
    else{
        cgpa=0.0;
        grade='F';
    }
    System.out.printf("percentage : "+"%.2f", per);
    System.out.println();
    System.out.println("Grade : "+grade);
    System.out.println("CGPA = "+cgpa);
    sc.close();

   }





}
