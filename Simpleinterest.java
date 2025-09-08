// write a program  to  calculate simple interest using the formula.take principal,rate,time as input from the user.
import java.util.Scanner;

public class Simpleinterest {
    Scanner sc = new Scanner(System.in);
    void interest() {
        System.out.println("Enter Principal:");
        double principal = sc.nextDouble();
        System.out.println("Enter Rate (%):");
        double rate  = sc.nextDouble();
        System.out.println("Enter Time (in years):");
        double time  = sc.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest is: " + simpleInterest);
    }
    public static void main(String[] args) {
        Simpleinterest obj = new Simpleinterest();
        obj.interest();
    }
}
