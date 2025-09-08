// print  numbers from 1 to 10 , but stop at 7 using break.
public class Usebreak {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i == 7) {
                break;
            }
        }
    }
}
