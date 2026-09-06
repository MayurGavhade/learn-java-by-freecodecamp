import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to Factorial generator\n");
        System.out.print("Please enter your number: ");
        long fact = factorial(input.nextInt());
        System.out.print("Factorial of your number is: " + fact);
    }

    public static long factorial(int num) {
        if(num == 1) {
            return 1;
        }
        return num * factorial(num -1);
    }
}
