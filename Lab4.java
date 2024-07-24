/**
 * Write a program that inputs the hourly rate and  number of hours worked.
 * Compute and display the gross pay (hourly rate * hours worked), 
 * your withholding tax, which is 15% of your gross pay and your net pay (gross pay – withholding tax).  
 */
import java.util.*;

/**
 * Lab4
 */
public class Lab4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hourlyRate, grossPay, withHoldingTax;
        int hoursWorked;  

        System.out.print("Hours rate: ");
        hourlyRate = sc.nextDouble();

        System.out.print("Hours worked: ");
        hoursWorked = sc.nextInt();

        System.out.print("Gross Pay: ");
        grossPay = sc.nextDouble();

        System.out.println("Withholding tax: " + (withHoldingTax = grossPay * 0.15));
        
        System.out.format("Net Pay: %.3f", (grossPay - withHoldingTax));
    }  
} 