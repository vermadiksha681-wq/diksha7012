// take an integer and check whether it is divisible by both 3 and 5 using a ternary operator.
import java.util.Scanner;
public class Ternaryoperator {
    void checkinteger()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        String result = (num%3==0 && num%5==0)?(num+ "is divisible by both 3 and 5"):(num+ "is not divisible by 3 and 5");
        System.out.println(result);

    }
    public static void main(String args[])
    {
        Ternaryoperator obj = new Ternaryoperator();
        obj.checkinteger();
    }
}
