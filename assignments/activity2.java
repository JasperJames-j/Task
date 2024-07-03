/*write a program that takes in three numbers from the users and outputs the largest number.
example: 

Enter three numbers: 7 12 3
The largest number is: 12

Enter three numbers: 2 2 2
all numbers are equal
*/


package assignments;
import java.util.Scanner;

public class activity2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        double num1, num2, num3;
        System.out.print("Enter three numbers:");
        num1 = s.nextDouble();
        num2 = s.nextDouble();
        num3 = s.nextDouble();
        
        System.out.println("The three numbers are: " + num1 +" | " + num2 +" | " + num3);

        if (num1 > num2 && num1 > num3) {
            System.out.println("The largest number is: " + num1);
        }
        else if (num2 > num1 && num2 > num3) {
            System.out.println("The largest number is: " + num2);
        }
        else if (num3 > num1 && num3 >num2) {
            System.out.println("The largest number is: " + num3);
        }
        else
            System.out.println("All numbers are equal");


    }
}
