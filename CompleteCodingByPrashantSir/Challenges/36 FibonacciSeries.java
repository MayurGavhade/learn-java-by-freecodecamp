import java.util.Scanner;

class FibonacciSeries{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for Fibonacci series: ");
        calculate(input.nextInt());
    }

    public static void calculate(int num) {
        int previousF = 0,previousFF = 1,F = 0;
        System.out.print(0);
        while(previousFF + previousF <= num) {
            F = previousF + previousFF;
            System.out.print(" "+F);
            previousF = previousFF;
            previousFF = F;
        }
    }
}