package DataTypesAndOperators;

import java.util.Scanner;

public class CurrencyConv {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount to convert");
        double amount = scanner.nextDouble();

        System.out.println("Choose option");
        System.out.println("USD to EUR");
        System.out.println("USD to GBP");
        System.out.println("EUR to USD");
        System.out.println("DBP to USD");

        int choice = scanner.nextInt();

        double conversionRate = 0;
        switch (choice) {
            case 1:
                conversionRate = 0.85;
                break;
            case 2:
                conversionRate = 0.75;
                break;
            case 3:
                conversionRate = 1.18;
                break;
            case 4:
                conversionRate = 1.33;
                break;
            default:
                System.out.println("Invalid Choice");
                return;
        }

        double convertedAmount = amount*conversionRate;

        System.out.println("Converted amount is: " + convertedAmount);

        scanner.close();
    }
}
