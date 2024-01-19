package edunexa;

import java.util.Scanner;

public class BasicCalculator 
{
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Menues:");
        System.out.println("\n");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("\n");

        System.out.print("Choose an option from above menues:");
        int chc=scanner.nextInt();
        
        System.out.println("\n");
        System.out.print("first number:");
        int n1 = scanner.nextInt();
        
        System.out.println("\n");
        System.out.print("second number:");
        int n2 = scanner.nextInt();

        switch (chc) 
        {
            case 1:
                System.out.println("\n");
                System.out.println("Output:"+add(n1,n2));
                break;
                
            case 2:
                System.out.println("\n");
                System.out.println("Output:"+sub(n1,n2));
                break;
                
            case 3:
                System.out.println("\n");
                System.out.println("Output:"+mult(n1,n2));
                break;
                
            case 4:
                if (n2!=0) 
                {
                    System.out.println("\n");
                    System.out.println("Output:"+div(n1,n2));
                } 
                
                else 
                {
                    System.out.println("\n");
                    System.out.println("Can't divide by zero");
                }
                break;
                
            default:
                System.out.println("\n");
                System.out.println("Invalid option");
        }
        scanner.close();
    }

    public static int add(int n1,int n2) 
    {
        return n1+n2;
    }

    public static int sub(int n1,int n2) 
    {
        return n1+n2;
    }

    public static int mult(int n1,int n2) 
    {
        return n1+n2;
    }

    public static int div(int n1,int n2) 
    {
        return n1+n2;
    }
}
