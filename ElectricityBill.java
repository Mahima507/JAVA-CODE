//Electricity billing System 

import java.util.*;

class ElectricityBill {
    public static void main(String args[]) {
        int units;
        double total = 0;
        double bill = 0;
        System.out.println("<------------ Billing system ------------> ");
        System.out.println("Total electricity used(in units) |  Rate(in rupess) ");
        System.out.println("             < 199               |    1.20          ");
        System.out.println("         200 < 400               |    1.50          ");
        System.out.println("         400 < 600               |    1.80          ");
        System.out.println("             > 600               |    2.00          ");

        System.out.println("If total bill is greater than Rs 400 then tax of 15% has to be paid .");
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter units of electricity used : ");
        units = sc.nextInt();

        if (units <= 199) {
            bill = units * 1.2;

        } else if (units <= 400) {
            bill = units * 1.5;
        } else if (units <= 600) {
            bill = units * 1.8;
        } else if (units > 600) {
            bill = units * 2;
        }

        if (bill > 400) {
            total = bill + (0.15 * bill);
        } else {
            total = bill;
        }
sc.close();
        System.out.println("Your Total bill is : " + total);
    System.out.println("-------------------------------------------------------------------------------------");
    System.out.println("Please pay the bill before the due date. ");
    System.out.println("Thanks you and have a nice day. ");
    }
}
