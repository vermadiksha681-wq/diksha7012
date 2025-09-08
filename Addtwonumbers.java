// write a program that takes two numbers as input from the user and prints their sum.
import java.util.Scanner;
public class Addtwonumbers {
    Scanner sc = new Scanner(System.in);
    void add()
    {
        System.out.println("Enter two numbers");
         int num1 = sc.nextInt();
         int num2 = sc.nextInt();
         int a= num1+num2;
         System.out.println("adition of two numbers: " +a);
    }
    public static void main(String args[])
    {
        Addtwonumbers obj = new Addtwonumbers();
        obj.add();
    }
}
