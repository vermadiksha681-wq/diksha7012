// take a number and print factorial using dowhile.
import java.util.Scanner;
public class Factorial {
     public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    int num = sc.nextInt();
    int i =1;
    long fact = 1;
    do{
        fact*=i;
        i++;
    }while(i<=num);
    System.out.println("Factorial of" +num+ "=" +fact);
 }

}
 

