// write a program to calculate the square and cube of a number using  the  * operator.
import java.util.Scanner;
public class Squarecube
{
  Scanner sc = new Scanner(System.in);
  void sqcube()
  {
    System.out.println("enter a number");
    int num1 = sc.nextInt();
    int square = num1*num1;
    System.out.println("square of number: "  +square);
    int cube = num1*num1*num1;
    System.out.println("cube of number: "  +cube);
  }
  public static void main(String args[])
  {
    Squarecube obj = new Squarecube();
    obj.sqcube();
  }
}