import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random randomNum = new Random();
        int computerNum = randomNum.nextInt(100);
        int playerNum = 0;

        while (true) {
            System.out.print("Guess a number (1-100): ");
            String userNum = scan.nextLine();
            boolean isValid = true;

            for (int i = 0; i < userNum.length(); i++) {
                if (userNum.charAt(i) < 48 || userNum.charAt(i) > 57) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                playerNum = Integer.parseInt(userNum);
                if (playerNum == computerNum) {
                    System.out.println("You guessed it!");
                    break;
                } else if (playerNum < computerNum) {
                    System.out.println("Too low!");
                } else if (playerNum > computerNum) {
                    System.out.println("Too high!");
                }
            }
        }
    }
}