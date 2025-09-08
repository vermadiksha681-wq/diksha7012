// print the multiplication table of a given number using for.
import java.util.Scanner;
public class Multiplicationtable {
    Scanner sc = new Scanner(System.in);
    void multi()
    {
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println("Multiplication table of " +num+":");
        for(int i =1;i<=10;i++){
            System.out.println(num + "x" +i+ "=" +(num*i));
        }
    }
    public static void main(String args[]){
        Multiplicationtable obj = new Multiplicationtable();
        obj.multi();
    }
}
