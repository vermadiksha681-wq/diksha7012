// Take a  string input and print charcaters one by one, but stop  when a space is found.

import java.util.Scanner;
public class Stringinput {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == ' ') {
                break; 
            }
            System.out.println(ch);
        }
    }
}
