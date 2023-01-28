//Grading System (Student 3 Subject Marks ) Total Marks, Percentage , 
//grade e.g >=90 A Grade , <90 to 70 B Grade , <70 to 60 C Grade , 60< to 50 D Grade, Otherwise F Grade 

import java.util.*; 
public class GRADE { 
    public static void main(String arg[]) { 
        Scanner sc = new Scanner(System.in); 
        int s1, s2, s3; 
        float total = 0, per; 
        System.out.println("Enter Marks of Subject 1:- "); 
        s1 = sc.nextInt(); 
        System.out.println("Enter Marks of Subject 2:- "); 
        s2 = sc.nextInt(); 
        System.out.println("Enter Marks of Subject 3:- "); 
        s3 = sc.nextInt(); 

        total = s1 + s2 + s3; 
        sc.close();

        System.out.println("The student Grade is: "); 
         per = total /3 ;
        System.out.println("Total Marks Scored : "+per);
        if (per >= 90){
        System.out.println("Grade A");
        }
        if (per < 90 && per >=70){
        System.out.println("Grade B");
        }
        if (per < 70 && per >=60){
        System.out.println("Grade C");
        }
        if (per < 60 && per >=50){
        System.out.println("Grade D");
        }
        if(per<50){
        System.out.println("Grde F");
        }
        }
       
    } 
