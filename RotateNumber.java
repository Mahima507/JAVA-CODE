import java.util.Scanner;

public class RotateNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int num = sc.nextInt();
        System.out.println("Enter the rotation ");
        int r = sc.nextInt();
        int copy = num;
        int countdigit = 0;
// count the digits of the given number
         while(copy!=0){
            copy = copy/10;
            countdigit = countdigit+ 1;
         }
// to stay within the range of the number;
         r = r % countdigit ; 
         if(r<0){ 
//for negative rotation;
            r = r + countdigit;
         }
        int power = (int)Math.pow(10,r);
        int leftpart = num/power;
        int rightpart = num%power;
        int count = countdigit - r;
        int result = rightpart*(int)Math.pow(10,count) + leftpart;
        System.out.println("rotated number is "+result);
        sc.close();
    }
}