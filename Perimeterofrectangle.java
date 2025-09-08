// write a program to calculate the perimeter of a rectangle . take the length and width as inputs and use the formula.

import java.util.Scanner;

public class Perimeterofrectangle {
     Scanner sc = new Scanner(System.in);
    void perimeter() {
        System.out.println("Enter the length of the rectangle:");
        double length = sc.nextDouble();
        System.out.println("Enter the width of the rectangle:");
        double width= sc.nextDouble();
        double peri = 2 * (length+width);
        System.out.println("perimeter of the rectangle: " + peri);
    }

    public static void main(String[] args) {
       Perimeterofrectangle obj = new Perimeterofrectangle();
        obj.perimeter();
    }
}
