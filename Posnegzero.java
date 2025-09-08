//take a number as input and check if it is psotive , negative , zero.
import java.util.Scanner;
public class Posnegzero {
    Scanner sc = new Scanner(System.in);
    void numbercheck()
    {
        System.out.println("enter a number");
        int num = sc.nextInt();
        if(num>0)
        {
            System.out.println("number is positive");
        }
        else if(num<0)
        {
            System.out.println("number is negative");
        }
        else 
        {
            System.out.println("number is zero");
        }
    }
    public static void main(String args[])
    {
      Posnegzero obj = new Posnegzero();
      obj.numbercheck();
    }
}
