import java.util.Scanner;

public class TempConv {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Temperature in Celsius");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius*9/5)+32;

        System.out.println(celsius + " C is equal to " + fahrenheit);

        scanner.close();
    }
}
