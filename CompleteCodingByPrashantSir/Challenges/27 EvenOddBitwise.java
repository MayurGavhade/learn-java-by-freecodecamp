import java.util.Scanner;

class EvenOddBitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number to check even or odd: ");

        int num = input.nextInt();

        if((num & 1) == 1) {
            System.out.println("the number is odd");
        } else {
            System.out.println("the number is even");
        }
    }
}