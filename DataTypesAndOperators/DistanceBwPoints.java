package DataTypesAndOperators;

import java.util.Scanner;

public class DistanceBwPoints {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x1 cords");
        double x1 = scanner.nextDouble();

        System.out.println("Enter y1 cords");
        double y1 = scanner.nextDouble();

        System.out.println("Enter x2 cords");
        double x2 = scanner.nextDouble();

        System.out.println("Enter y2 cords");
        double y2 = scanner.nextDouble();

        double deltaX = x2-x1;
        double deltaY = y2-y1;
        double distance = Math.sqrt((deltaX*deltaX)+(deltaY*deltaY));

        System.out.println("The distance between two given points is: " +distance);

        scanner.close();
    }
}
