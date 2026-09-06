import java.util.Scanner;

class GuessGame {
    public static void main(String[] args) {
        int actualNum = randomNumber();
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to Guess Number Game\n");
        System.out.print("Take a guess from 0 to 9: ");
        int guessNum = input.nextInt();
        if(guessNum == actualNum) {
            System.out.println("You Won");
        } else {
            System.out.println("You Lost, The actual answer was " + actualNum);
        }
    }

    public static int randomNumber() {
        return (int) (Math.random() * 10);
    }
}