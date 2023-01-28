// LCM of a Number
import java.util.*;

public class LCM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number --> ");
        int n1 = sc.nextInt();

        System.out.println("Enter second number --> ");
        int n2 = sc.nextInt();

        int lcm;

        // maximum number between n1 and n2 is stored in lcm
        lcm = (n1 > n2) ? n1 : n2;

        while (true) {
            if (lcm % n1 == 0 && lcm % n2 == 0) {
                System.out.println("The LCM of " + n1 + " and " + n2 + " is :-  " + lcm);
                break;
            }
            ++lcm;
        }
     sc.close();
    }
    
}