// write a program to calculate the area of circle. take the radius as input and use the formula.
import java.util.Scanner;
public class Areaofcircle {
    Scanner scanner = new Scanner(System.in);
    void calculateArea() {
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
       
        double area = Math.PI * radius * radius;
         System.out.println("Area of the circle with radius " + radius + " is: " + area);
         scanner.close();
    }

    public static void main(String[] args) {
      Areaofcircle  obj = new Areaofcircle();
      obj.calculateArea();
    
       
    }
}
