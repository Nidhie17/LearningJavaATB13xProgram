package ex_11_While;

import java.util.Random;
import java.util.Scanner;

public class while_guessing_Game {
    public static void main(String[] args) {
        Random random = new Random();
        int numbertoGuess = random.nextInt(100)+1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int guess;
        int attempts = 0;
        while (true) {
            guess = sc.nextInt();
            attempts++ ;
            if (guess < numbertoGuess) {
                System.out.println("number is too low");
            } else if (guess > numbertoGuess) {
                System.out.println("number is too high");

            } else {
                System.out.println("Congratulations is matched! you matched in " + attempts + "attempts");
                break;

            }
        }
    }

}