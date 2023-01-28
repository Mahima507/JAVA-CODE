// Reverse a Number (Hint : % , *) :-
import java.util.*;
public class Reverse { 
public static void main(String[] args) { 
     int num, rev = 0;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number whose reverse need to be found");
     num = sc.nextInt();

       while(num != 0) 
       {  
         int remainder = num % 10;  
         rev = rev * 10 + remainder;  
         num = num/10;  
     
        } 

     System.out.println("The reverse of the given number is: " + rev);  

  sc.close();
}  
}
