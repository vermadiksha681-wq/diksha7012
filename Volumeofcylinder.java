// write a program to calculate the volume of cylinder . take the radius  and height as inputs use the formula.
import java.util.Scanner;
public class Volumeofcylinder {
    Scanner sc = new Scanner(System.in);
    void volume() {
        System.out.println("Enter the radius of the cylinder:");
        double radius = sc.nextDouble();
        System.out.println("Enter the height of the cylinder:");
        double height = sc.nextDouble();
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of the cylinder: " + volume);
    }

    public static void main(String[] args) {
        Volumeofcylinder obj = new Volumeofcylinder();
        obj.volume();
    }
}

