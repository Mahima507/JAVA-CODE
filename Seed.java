import java.util.Scanner;

public class Seed {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number --> ");
        num1 = sc.nextInt();
        System.out.println("Enter second number --> ");
        num2 = sc.nextInt();

        int seed = num1;
        while (num1 > 0) {
            seed = seed * (num1 % 10);
            num1 = num1 / 10;
        }
        if (seed == num2)
            System.out.println("True");
        else {
            System.out.println("False");
        }
     sc.close();
   
    }

}
 
