
import java.util.*;

class isDivisible {

    public static void main(String[] args) {

        System.out.println("Please enter the number to be checked --> ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while (n != 0) {
            int k = (int)n % 10;
            sum += k;
            n /= 10;
        }

        if (temp % sum == 0) {
            System.out.println("YES number is divisible with its sum of digits .");
        }

        else {
            System.out.println("NO number is divisible with its sum of digits .");
        }

     sc.close();   
    }
}
