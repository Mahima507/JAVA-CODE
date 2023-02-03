
import java.util.Scanner;

class PrimeNo {
    public static void main(String arg[]) {
        int i, count;
        System.out.print("Enter the value of n --> ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Prime numbers between 1 and " + n + " are --> ");
        for (int j = 2; j <= n; j++) {
            count = 0;
            for (i = 1; i <= j; i++) {
                if (j % i == 0) {
                    count++;
                }
            }
            if (count == 2)
                System.out.print(j + "  ");
        }
    sc.close();
    }
}
