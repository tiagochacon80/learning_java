package application;

import services.CanadaInterestService;
import services.InterestService;
import services.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Months: ");
        int months = sc.nextInt();

        InterestService cis = new CanadaInterestService(2.0);
        double cadPayment = cis.payment(amount, months);

        InterestService uis = new UsaInterestService(1.0);
        double usaPayment = uis.payment(amount, months);

        System.out.println("***CANADIAN INTEREST***");
        System.out.println("Payment after " + months + " months:");
        System.out.println(String.format("%.2f", cadPayment));

        System.out.println();
        System.out.println("***USA INTEREST***");
        System.out.println("Payment after " + months + " months:");
        System.out.println(String.format("%.2f", usaPayment));

        sc.close();
    }
}
