package DataTypesAndOperators;

import java.util.Scanner;

public class PowerNum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = scanner.nextInt();

        System.out.println("Enter the power for a:");
        int n = scanner.nextInt();

        int res = 1;
        for(int i=0;i<n;i++){
            res = res*a;
        }

        System.out.println("The answer of " +a+ " powered to " +n+ " is " +res);

        scanner.close();
    }
}
