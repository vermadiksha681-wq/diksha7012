//print numbers from 1 to 10 , but skip 5 using continue.
public class Usecontinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; 
            }
            System.out.println(i);
        }
    }
}
