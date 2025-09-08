import java.util.Scanner;
public class Evenodd {
    Scanner sc = new Scanner(System.in);
    void check()
    {
        System.out.println("enter a number ");
        int num = sc.nextInt();
        if(num%2==0)
        {
            System.out.println("number is even");
        }
        else {
             System.out.println("number is odd");
        }
    }
    public static void main(String args[])
    {
        Evenodd obj = new Evenodd();
        obj.check();
    }
}
