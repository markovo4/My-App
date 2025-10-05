package app;

import java.util.Scanner;

public class Main {
    static String taxTemplate = "Your total tax based on %f%% tax rate: $%f";

    public static void calculateTax ( long annualSalary, float taxPercent ) {
        double calculatedTax = ( taxPercent / 100 ) * annualSalary;
        System.out.printf(taxTemplate, taxPercent, calculatedTax);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your annual salary for tax calculation: ");

        long annualSalary = sc.nextLong();
        if(annualSalary < 0) System.out.println("Invalid salary!");

        if(annualSalary <= 10_000){
            calculateTax(annualSalary, 2.5f);
        } else if (annualSalary <= 25_000) {
            calculateTax(annualSalary, 4.3f);
        } else {
            calculateTax(annualSalary, 6.7f);
        }

    }
}
