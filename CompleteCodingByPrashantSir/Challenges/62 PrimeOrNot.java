import java.util.Scanner;

class PrimeOrNotForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to Prime number checker\n");
        System.out.print("Enter your prime number: ");
        int num = input.nextInt(); // 5 or 1
        boolean isPrime = false;
        for (int i = 2; num % i == 1 && num != 1; i++) {
           isPrime = true;
        }
        if (isPrime || num == 1) {
            System.out.print("The number is prime\n");
        } else {
            System.out.print("The number is not prime\n");
        }
    }
}