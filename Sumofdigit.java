// print the sum of digits of a given number using while.
import java.util.Scanner;
public class Sumofdigit {
    Scanner sc =  new Scanner(System.in);
    void sum()
    {
        System.out.println("enter a number");
        int num = sc.nextInt();
        int sum =0;
        while(num>0){
            int digit = num%10;
            sum +=digit;
            num = num/10;
            
        }
        System.out.println("sum of digits" +sum);

    }
    public static void main(String args[])
    {
        Sumofdigit obj = new Sumofdigit();
        obj.sum();
    }
}
