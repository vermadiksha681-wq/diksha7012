// take marks as input and print the grade  using if else :(90+ -> A, 75-89 -> B , 50-74 -> c. below 50 -> fail).
import java.util.Scanner;
public class Grade {
    Scanner sc = new Scanner(System.in);
    void marks()
    {
        System.out.println("enter marks ");
        int mark = sc.nextInt();
        if(mark>90)
        {
            System.out.println("grade is A");

        }
        else if(mark>75&&mark<89)
        {
            System.out.println("grade is B");

        }
        else if(mark>50&&mark<74)
        {
            System.out.println("grade is c");

        }
        else if(mark<50)
        {
            System.out.println("fail");

        }

    }
     public static void main(String args[])
        {
            Grade obj = new Grade();
            obj.marks();
        }

}
