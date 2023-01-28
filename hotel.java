// Hotel Menu System
import java.util.*;
public class hotel {
 public static void main(String[] args) {
 int total =0;
 System.out.println("----------------Menu--------------");
 Scanner sc= new Scanner(System.in);
 while(true){
 System.out.println("Press 1 For Tea Rs20/-");
 System.out.println("Press 2 For Ice-cream Rs60/-");   
 System.out.println("Press 3 For Burger Rs50/-");
 System.out.println("Press 4 For Pizza Rs399/-");
 System.out.println("Press 5 For coffee Rs50/-");  
 System.out.println("Press 6 For Veggie loaded frittatas Rs69/-");
 System.out.println("Press 7 For Fruite salad Rs99/-");
 System.out.println("Press 8 For Brown rice pasta Rs95/-");
 System.out.println("Press 9 For One-pot soup Rs199/-");
 System.out.println("Press 10 to Exit");
 System.out.println("--------------------------------------------------------------");
 System.out.print("Enter your choice :");
 int a = sc.nextInt();

 switch (a)
 {
   
 case 1 :
 System.out.println("-------------------------------------");
 System.out.println("You have Ordered Tea");
 System.out.println("-------------------------------------");
 total=total +20;
 break;
 case 2:
 System.out.println("-------------------------------------");
 System.out.println("You have Ordered Ice-cream");
 System.out.println("-------------------------------------");
 total=total+60;
 break;
 case 3:
 System.out.println("-------------------------------------");
 System.out.println("You have Ordered Burger");
 System.out.println("-------------------------------------");
total= total+50;
 break;
 case 4 :
 System.out.println("-------------------------------------");
 System.out.println("You have Ordered Pizza");
 System.out.println("-------------------------------------");
 total=total +399;
 break;
 case 5:
 System.out.println("-------------------------------------");
 System.out.println("You have Ordered Coffee");
 System.out.println("-------------------------------------");
 total = total +50;
 break;
 case 6:
 System.out.println("-------------------------------------");
 System.out.println("You have Ordered Veggie loaded frittatas");
 System.out.println("-------------------------------------");
 total = total+69;
 break;
 case 7 :
 System.out.println("-------------------------------------");
 System.out.println("You have Ordered Fruite salad");
 System.out.println("-------------------------------------");
 total = total+99;
 break;
 case 8:
 System.out.println("-------------------------------------");
 System.out.println("You have Ordered Brown rice pasta");
 System.out.println("-------------------------------------");
 total = total+95;
 break;
 case 9:
 System.out.println("-------------------------------------");
 System.out.println("You have Ordered  One-pot soup");
 System.out.println("-------------------------------------");
 total = total+199;
 break;
 case 10:
 System.out.println("Thanks for Selecting ");
 System.exit(0);
 
 }
 System.out.println("---------------------------------------------------------------");
 System.out.println("Your total bill is : " + total);
 System.out.println("---------------------------------------------------------------");
 } 
} 
 
}
