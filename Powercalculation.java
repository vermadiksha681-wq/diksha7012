// write a program that takes two numbers as input: a base and an exponent,and prints the result of base raised to the exponent(without using loops or conditionals).

import java.util.Scanner;
public class Powercalculation {
    void power() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        double base = sc.nextDouble();
        System.out.print("Enter the exponent: ");
        double exponent = sc.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
        sc.close();
    }
    public static void main(String[] args) {
        Powercalculation obj = new Powercalculation();
        obj.power();
    }
}

