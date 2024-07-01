package works;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int lives = 3;
        String answer;
        
        while (lives > 0) {
            System.out.println("Am I handsome?");
            System.out.print("Answer: ");
            answer = s.nextLine();

            if (answer.equalsIgnoreCase("yes")) {
                break;
            }
            else{
                lives --;
            }
        }

        System.out.println();
        
        if (lives > 0) {
            System.out.println("Thank you for your honesty <3");
        }else{
            System.out.println("You're krazy!");
        }
    }
}
