// take a character  input and check whether it is vowel or consonant using switch.
import java.util.Scanner;
public class Vowelconsonent {
    public void checkvowelconsonant()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a charcater ");
        char ch = sc.next().charAt(0);
        ch = Character.toLowerCase(ch);
        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
        
        System.out.println(ch + "is a vowel");
        break;
        default:
        if(ch >='a' && ch <='z')
        {
        System.out.println(ch + "is a consonant");
        }
        else {
         System.out.println("Invalid input , please enter alphabet");
        }
        
    }
}
public static void main(String args[])
{
    Vowelconsonent obj = new Vowelconsonent();
    obj.checkvowelconsonant();

}
}
