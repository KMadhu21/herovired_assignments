import java.util.InputMismatchException;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        
        int choice;
        Scanner sc = new Scanner(System.in);
        try {
          char ch; 
        do {
            System.out.println("Calculator Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Percentage");
            System.out.println("6. Factorial");
            System.out.println("7. Square");
            System.out.println("8. Cube");
            System.out.println("9. Square Root");
            System.out.println("10. a Power b");
            System.out.println("11. a Root b");
            

            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter two numbers separated by space: ");
                    try {
                        int n1 = sc.nextInt();
                        int n2 = sc.nextInt();
                        System.out.println("Result: " + (n1 + n2));
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input! Please enter two valid integers separated by space.");
                        sc.nextLine(); 
                    }
                    break;
                case 2:
                    System.out.print("Enter two numbers separated by space: ");
                    try {
                        int n1 = sc.nextInt();
                        int n2 = sc.nextInt();
                        System.out.println("Result: " + (n1 - n2));
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input! Please enter two valid integers separated by space.");
                        sc.nextLine(); 
                    }
                    break;
                case 3:
                    System.out.print("Enter two numbers separated by space: ");
                    try {
                        int n1 = sc.nextInt();
                        int n2 = sc.nextInt();
                        System.out.println("Result: " + (n1 * n2));
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input! Please enter two valid integers separated by space.");
                        sc.nextLine(); 
                    }
                    break;
                case 4:
                    System.out.print("Enter two numbers separated by space: ");
                    try {
                        int n1 = sc.nextInt();
                        int n2 = sc.nextInt();
                        if (n2 == 0) {
                            System.out.println("Cannot divide by zero!");
                        } else {
                            System.out.println("Result: " + ((double) n1 / n2));
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input! Please enter two valid integers separated by space.");
                        sc.nextLine(); 
                    }
                    break;
                case 5:
                    System.out.print("Enter a number: ");
                    try {
                        int n1 = sc.nextInt();
                        System.out.print("Enter a percentage: ");
                        int n2 = sc.nextInt();
                        System.out.println("Result: " + ((double) n1 * n2 / 100));
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input! Please enter a valid integer and a valid percentage.");
                        sc.nextLine(); 
                    }
                   
                    break;
                case 6:
                    System.out.print("Enter a number: ");
                    try {
                        int n = sc.nextInt();
                        if(n>65)
                        System.out.println("The variable can not store the result!, Variable is over flowed");
                        else if(n<0)
                        System.out.println("We can't find Factorial for Negative numbers");
                        else{
                            long result = 1;
                        for (int i = 1; i <= n; i++) {
                            result *= i;
                        }
                        System.out.println("Result: " + result);
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input! Please enter a valid integer.");
                        sc.nextLine(); 
                    }
                    break;
                case 7:
                    System.out.print("Enter a number: ");
                    try {
                        int n = sc.nextInt();
                        System.out.println("Result: " + (n * n));
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input! Please enter a valid integer.");
                        sc.nextLine(); 
                    }
                    break;
                case 8:
                    System.out.print("Enter a number: ");
                    try {
                        int n = sc.nextInt();
                        System.out.println("Result: " + (n * n * n));
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input! Please enter a valid integer.");
                        sc.nextLine(); 
                    }
                    break;
                case 9:
                    System.out.print("Enter a number: ");
                    try {
                        double n = sc.nextDouble();
                        if (n < 0) {
                            System.out.println("Cannot find square root of a negative number!");
                        } else {
                            System.out.println("Result: " + Math.sqrt(n));
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input! Please enter a valid number.");
                        sc.nextLine(); 
                    }
                    break;
                case 10:
                    System.out.print("Enter two numbers separated by space: ");
                    try {
                        double a = sc.nextDouble();
                        double b = sc.nextDouble();
                        System.out.println("Result: " + Math.pow(a, b));
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input! Please enter two valid numbers separated by space.");
                        sc.nextLine(); 
                    }
                    break;
                case 11:
                    System.out.print("Enter two numbers separated by space: ");
                    try {
                        double a =sc.nextDouble();
                        double b = sc.nextDouble();
                        if (b == 0) {
                            System.out.println("Cannot find root with 0 as exponent!");
                        } else if (a < 0 && b % 2 == 0) {
                            System.out.println("Cannot find even root of a negative number!");
                        } else {
                            System.out.println("Result: " + Math.pow(a, 1.0 / b));
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input! Please enter two valid numbers separated by space.");
                        sc.nextLine(); 
                    }
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid choice.");
            }
    
            System.out.print("Do you want to perform other operations..(y to perform) : ");
            ch=sc.next().charAt(0);
        } while (ch=='y'||ch=='Y');
    } 
        catch (InputMismatchException e) 
        {
            System.out.println("Invalid input! Please enter a valid choice.");
            sc.nextLine(); 
            
        }
    
        sc.close();
    }
}
