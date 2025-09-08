// wrtie a program to take a  user's name and age as input and print: " hello , you are year old.
import java.util.Scanner;
public class Userinput {
   public static  void main(String args[]) 
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter name");
    String name = sc.next();
    System.out.println("enter  age");
    int age= sc.nextInt();
    System.out.println("name:" +name);
    System.out.println("age:" +age);
    System.out.println("hello, you are " +age + "    years old");
   }
}