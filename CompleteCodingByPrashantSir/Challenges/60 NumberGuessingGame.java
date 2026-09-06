import java.util.Random;
import java.util.Scanner;

class NumberGuessingGame {
    public static void main(String[] args) {
        int randomNum = (int) (Math.random() * 10);
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to Number guessing game\n");
        boolean isGuessed = true;
        int guessNum;
        do {
            System.out.print("Enter a number from 1 to 9 to be guessed: ");
            guessNum = input.nextInt();
            if(guessNum == randomNum) isGuessed = false;
        } while (isGuessed);
        System.out.print("You have guess right answer " + guessNum);
    }
}