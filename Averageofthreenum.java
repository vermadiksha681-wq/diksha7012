// write a program that takes three numbers as input from the user and prints their average.

import java.util.Scanner;
public class Averageofthreenum {
    void average() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter third number: ");
        double num3 = sc.nextDouble();
        double avg = (num1 + num2 + num3) / 3;
        System.out.println("Average of the three numbers is: " + avg);
        sc.close();
    }
    public static void main(String[] args) {
        Averageofthreenum obj = new Averageofthreenum();
        obj.average();
    }
}
