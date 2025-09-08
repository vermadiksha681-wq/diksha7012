// take three numbers as input and find the largest using logical operator (&&).
import java.util.Scanner;
public class Largestamongthree {
    Scanner sc = new Scanner(System.in);
    void largest()
    {
         System.out.println("Enter three numbers");
         int num1 = sc.nextInt();
         int num2 = sc.nextInt();
         int num3 = sc.nextInt();
        if(num1>num2&&num1>num3)
        {
            System.out.println("number 1 is greater ");
        }
       else  if(num2>num1&&num2>num3)
        {
            System.out.println("number 2 is greater ");
        }
        else {
            System.out.println("number 3 is greater ");
        }
        
    }
    public static void main(String args[])
    {
        Largestamongthree obj = new Largestamongthree();
        obj.largest();
    }

}
