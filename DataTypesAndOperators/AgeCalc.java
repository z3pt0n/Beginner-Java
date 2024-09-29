package DataTypesAndOperators;

import java.util.Scanner;

public class AgeCalc {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Current Year: ");
        double currentYear = scanner.nextDouble();

        System.out.println("Enter Birth Year");
        double birthYear = scanner.nextDouble();

        double age = currentYear - birthYear;
        System.out.println("Current Age is:" +age);

        scanner.close();
    }

}
