import java.util.Scanner;
public class arthmetic {
    Scanner sc = new Scanner(System.in);
    void sum() 
    {
        System.out.println("enter two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int a = num1+num2;
        System.out.println("addition of numbers: " +a);
    } 
    void diff() 
    {
        System.out.println("enter two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int a = num1-num2;
        System.out.println("subtraction of numbers: " +a);
    }
    void product() 
    {
        System.out.println("enter two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int a = num1*num2;
        System.out.println("addition of numbers: " +a);
    }
    void quo() 
    {
        System.out.println("enter two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int a = num1/num2;
        System.out.println("addition of numbers: " +a);
    }
    public static void main(String args[])
    {
        arthmetic obj = new arthmetic();
        obj.sum();
        obj.diff();
        obj.product();
        obj.quo();
    }
}
