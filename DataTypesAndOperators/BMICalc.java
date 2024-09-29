package DataTypesAndOperators;

import java.util.Scanner;

public class BMICalc {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Weight");
        double weight = scanner.nextDouble();

        System.out.println("Enter Height");
        double height = scanner.nextDouble();

        double bmi = weight/(height*height);

        System.out.println("BMI is :" + bmi);

        scanner.close();
    }
}
