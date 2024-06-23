package works;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your 4 grades to compute the average:");

        System.out.print("Grade in Math    : ");
        double math = s.nextDouble();

        System.out.print("Grade in Science : ");
        double science = s.nextDouble();

        System.out.print("Grade in English : ");
        double english = s.nextDouble();

        System.out.print("Grade in Filipino: ");
        double filipino = s.nextDouble();

        double average = (math + science + english + filipino) / 4;

        System.out.println("Your average grade is: " + average);

        if (average > 100) {
            System.out.println("Invalid Grade");
        }
        else if(average >=98){
            System.out.println("With highest honors");
        }
        else if(average >= 95){
            System.out.println("With high honors");
        }
        else if(average >= 90){
            System.out.println("With honors");
        }
        else if(average >= 75){
            System.out.println("Passed");
        }
        else{
            System.out.println("failed");
        }

    }
}

