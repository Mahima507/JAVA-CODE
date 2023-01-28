//ArmStrong Number e.g 153 1 ^3 + 5 ^ 3 + 3 ^3 = 153

import java.util.*;
public class Armstrong {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = 371,  r, result = 0;
       System.out.print("Enter a number :- ");
       num = sc.nextInt();
        int originalnum = num;

        while (originalnum != 0)
        {
            r = originalnum % 10;
            result += Math.pow(r, 3);
            originalnum /= 10;
        }

        if(result == num)
            System.out.println(num + " is an Armstrong number.");
        else
    
        System.out.println(num + " is not an Armstrong number.");
    sc.close();
    }
} 