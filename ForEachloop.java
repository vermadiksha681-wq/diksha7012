// store an array of 5 integers and print them using a for each loop
import java.util.Scanner;
public class ForEachloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Please enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("\nYou entered the following integers:");
        for (int number : numbers) {
            System.out.println(number);
        }
}
}