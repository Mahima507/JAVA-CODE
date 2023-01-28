//Sum of Digit (Sum of Even Places and Odd Places) and Print Both of Them.
import java.util.*;

class SumOfDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        boolean isOdd = (n % 2 == 1) ? true : false;

        int sumOdd = 0, sumEven = 0;

        while (n != 0) {

            if (isOdd)
                sumOdd += n % 10;

            else
                sumEven += n % 10;
            isOdd = !isOdd;
            n /= 10;
        }
        System.out.println("Sum of digits at odd places = " + sumOdd);
        System.out.println("Sum od digits at even places = " + sumEven);
    sc.close();
    }
}