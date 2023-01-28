//  Sum of Series 1 + 1/2 + 1/3 + 1/4 + 1/5....n;
import java.util.Scanner;
public class SumOfSeries {
    public static void main(String args[]) {

         Scanner sc = new Scanner(System.in); {
            System.out.println("Series -->   1/1 + 1/2 + 1/3 + ..+ 1/n");
            System.out.println("Please enter the value of n (for above series) --> ");

            double n = sc.nextDouble();

            double i;
            double sum = 0.0;
            for (i = 1; i <= n; i++) {
                sum = sum + 1 / i;
            }
            System.out.println("Sum is : " + sum);

            sc.close();
        }
    }
}