import java.util.Scanner;
import java.text.DecimalFormat;

public class salestax {
    public static void main(String[] args) {
  
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat taxFormat = new DecimalFormat("#.##");
        
        System.out.println("Please enter purchase amount:");
        double purchaseAmountFromUser = keyboard.nextDouble();
        
        double stateSalesTax = purchaseAmountFromUser * 0.04;
        double countySalesTax = purchaseAmountFromUser * 0.02;
        double totalSalesTax = stateSalesTax + countySalesTax;
        double purchaseTotal = purchaseAmountFromUser + stateSalesTax + countySalesTax;
        
        System.out.println("Your purchase amount was: " + purchaseAmountFromUser);
        System.out.println("Your state sales tax was: " + taxFormat.format(stateSalesTax));
        System.out.println("Your county sales tax was: " + taxFormat.format(countySalesTax));
        System.out.println("Your total sales tax was: " + taxFormat.format(totalSalesTax));
        System.out.println("Your purchase total was: " + taxFormat.format(purchaseTotal));
        
} 
}
