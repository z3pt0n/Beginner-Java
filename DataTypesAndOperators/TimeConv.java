package DataTypesAndOperators;

import java.util.Scanner;

public class TimeConv {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the time to be converted: ");
        double timeValue = scanner.nextDouble();

        System.out.println("Choose Conversion");
        System.out.println("Hours to Minutes");
        System.out.println("Hours to Seconds");
        System.out.println("Minutes to Seconds");
        System.out.println("Minutes to Hours");
        System.out.println("Seconds to Minutes");
        System.out.println("Seconds to Hours");

        int choice = scanner.nextInt();

        double convertedTime;

        switch (choice){
            case 1:
                convertedTime = timeValue*60;
                System.out.println(timeValue + "Hours = " + convertedTime + " Minutes");
                break;
            case 2:
                convertedTime = timeValue*3600;
                System.out.println(timeValue + "Hours = " + convertedTime + "Seconds");
                break;
            case 3:
                convertedTime = timeValue*60;
                System.out.println(timeValue + "Minutes = " + convertedTime + "Seconds");
                break;
            case 4:
                convertedTime = timeValue/60;
                System.out.println(timeValue + "Minutes =" + convertedTime + "Hours");
                break;
            case 5:
                convertedTime = timeValue/60;
                System.out.println(timeValue + "Seconds = " + convertedTime + "Minutes");
                break;
            case 6:
                convertedTime = timeValue/3600;
                System.out.println(timeValue + "Seconds =" + convertedTime + "Hours");
                break;
            default:
                System.out.println("Invalid Conversion");
        }
        scanner.close();
    }
}
