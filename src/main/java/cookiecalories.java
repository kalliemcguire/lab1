import java.util.Scanner;

public class cookiecalories {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("How many cookies did you eat?:");
        double numberOfCookies = keyboard.nextDouble();
        
        double caloriesPerCookie = 300 / 4;
        double caloriesConsumed = numberOfCookies * caloriesPerCookie;
        
        System.out.println("You ate " + caloriesConsumed + " calories of cookies.");
        
    }         
}
