package ControlFlowStatements;

import java.util.Scanner;

public class VotingEligibilityCheck {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter age of voter: ");
        int age = scanner.nextInt();

        if (age >= 18){
            System.out.println("Voter eligible for voting.");
        }
        else{
            System.out.println("Voter Not Eligible.");
        }

        scanner.close();
    }
}
