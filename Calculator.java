import java.util.*;

public class Calculator {

    public static void main(String[] args) {

        while (true) {
            Scanner sc = new Scanner(System.in);

            int choice;

            System.out.println("Calculator Main Menu\n");
            System.out.print("1.) Addition \n");
            System.out.print("2.) Subtraction.\n");
            System.out.print("3.) Multiplication.\n");
            System.out.print("4.) Division.\n");
            System.out.print("5.) Modulus.\n");
            System.out.print("6.) Cube Of a number.\n");
            System.out.print("7.) Power.\n");
            System.out.print("8.) Absolute Value.\n");
            System.out.print("9.) Decimal to Binary Conversion\n");
            System.out.print("10.) Exit\n");
            System.out.print("\nEnter Your Menu Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    double adNumf, adNuml, sum;
                    System.out.print("Please Enter The First Number: ");
                    adNumf = sc.nextDouble();
                    System.out.print("\nPlease Enter The Second Number: ");
                    adNuml = sc.nextDouble();
                    sum = adNumf + adNuml;
                    System.out.print("The Sum Of Those Numbers is: " + sum);
                    break;

                case 2:
                    double subNum1, subNum2, sum2;
                    System.out.println("\nPlease Enter The First Number: ");
                    subNum1 = sc.nextDouble();
                    System.out.println("Please Enter The Second Number: ");
                    subNum2 = sc.nextDouble();
                    sum2 = subNum1 - subNum2;
                    System.out.println("The Subtraction Leaves The Number: " + sum2);
                    break;

                case 3:
                    double multNum1, multNum2, multTotal;

                    System.out.println("Please Enter The First Number To Multiply: ");
                    multNum1 = sc.nextDouble();
                    System.out.println("Please Enter The Second Number To Multiply: ");
                    multNum2 = sc.nextDouble();

                    multTotal = multNum1 * multNum2;

                    System.out.println("The Multiplied Numbers Are: " + multTotal);
                    break;

                case 4:

                    double divNum1, divNum2, divTotal;
                    System.out.println("Enter Your Numerator ");
                    divNum1 = sc.nextDouble();
                    System.out.println("Enter Your Denominator ");
                    divNum2 = sc.nextDouble();
                    if (divNum2 == 0) {
                        System.out.println("Zero is Not divisable, please select a new denominator: ");
                        divNum2 = sc.nextInt();
                    }
                    divTotal = divNum1 / divNum2;
                    System.out.println("Your divisor is: " + divTotal);
                    break;

                case 5:

                    double modNum1, modNum2, modTotal;
                    System.out.println("Enter Your Numerator ");
                    modNum1 = sc.nextDouble();
                    System.out.println("Enter Your Denominator ");
                    modNum2 = sc.nextDouble();
                    modTotal = modNum1 % modNum2;
                    System.out.println("Your remainder is: " + modTotal);
                    break;

                case 6:

                    double cubeNum1, cubeTotal;
                    System.out.println("Enter a number ");
                    cubeNum1 = sc.nextDouble();
                    cubeTotal = cubeNum1 * cubeNum1 * cubeNum1;
                    System.out.println("Cube of entered number is: " + cubeTotal);
                    break;

                case 7:

                    double num, pow, ans;
                    System.out.println("Enter a number ");
                    num = sc.nextDouble();
                    System.out.println("Enter power ");
                    pow = sc.nextDouble();
                    ans = Math.pow(num, pow);
                    System.out.println("Your answer is: " + ans);
                    break;

                case 8:

                    double absnum, absAns;
                    System.out.println("Enter a number ");
                    absnum = sc.nextDouble();
                    absAns = Math.abs(absnum);
                    System.out.println("Absolute value of given number is: " + absAns);
                    break;

                    case 9:
                    int N, B_Number=0;
                    System.out.println("Enter a number ");
                    N = sc.nextInt();
                    int cnt = 0;
                    while (N != 0) {
                        int rem = (int) (N % 2);
                        double c = Math.pow(10, cnt);
                        B_Number += rem * c;
                        N /= 2;
                        cnt++;
                    }
                    System.out.println("Binary value of given number is: " + B_Number);
                    break;
                
                    case 10:
                    System.out.println("Exiting Program...");
                    System.exit(0);
                    break;
            }
            

            if (choice > 6 || choice < 1) {
                System.out.println("This is not a valid Menu Option! Please Select Another.");
                do {
                    choice = sc.nextInt();
                } while (choice < 7);
            }
            sc.close();
        }
    }
}