// write a program that takes the distance in kilometers as input from the user and convert it into miles using the formula.
import java.util.Scanner;
public class Kilotomiles {
    void convert() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double kilometers = sc.nextDouble();

        double miles = kilometers * 0.621371;

        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");

        sc.close();
    }

    public static void main(String[] args) {
        Kilotomiles obj = new Kilotomiles();
        obj.convert();
    }
}
