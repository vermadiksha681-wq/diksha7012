// take two number as input and check which one is greater using > operator
import java.util.Scanner;
public class Greateramongtwo {
    Scanner sc = new Scanner(System.in);
    void greater()
    {
        System.out.println("enter two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1>num2)
        {
            System.out.println("number 1 is greater");
        }
        else {
            System.out.println("number 2 is greater");
        }
    } 
    public static void main(String args[])
    {
        Greateramongtwo obj = new Greateramongtwo();
        obj.greater();
    }
}
