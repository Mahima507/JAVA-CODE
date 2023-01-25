import java.util.Scanner;
public class Gross_Salary {
    public static void main(String[] args) { 
double HRA, TA,MA,PF, netSalary, grossSalary;
double basic, tax;
Scanner sc = new Scanner(System.in);
System.out.println("Enter basic salary");
basic = sc.nextDouble();
HRA = basic*0.5;
TA = basic *0.3;
MA = basic *0.25;
PF = basic *0.1;
grossSalary = basic +HRA +TA +MA;
tax = grossSalary *0.1;
netSalary = grossSalary - tax - PF;
System.out.println("Net Salary is " +netSalary);
 System.out.println("---------------------Company Name-----------------------------");       
 System.out.println("----------------Salary slip for Oct 2022----------------------");
 System.out.println("Name                              Department  ");
 System.out.println("Emp. No                           Bank Name");
 System.out.println("Designation                       A/c No.");
 System.out.println("");
 System.out.println("---------------Earnings---------|----Deductions----------------");
 System.out.println("Basic Salary           25200    | EPF                    1800");
 System.out.println("House Rent Allownances  9408    | Health Insurance        500");
 System.out.println("Conveyance Allownances  1493    | Professional Tax        200");
 System.out.println("Medical Allownances     1167    | TDS                        ");
 System.out.println("Special  Allownances    18732   |                             ");
 System.out.println("Gross Salary            56000   | Total Deductions        2500");
 
 System.out.println("           Net Pay              |        53500                 ");
 System.out.println("---------------------------------------------------------------");
 
 System.out.println("       Amount in Words:    Fifty Three Thousand Five Hundred  ");
 System.out.println("---------------------------------------------------------------");
}
}