import java.util.Scanner;

class FibonacciSeriesRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to Fibonacci Series printer\n");
        System.out.print("Enter number upto fibonacci series: ");
        int num = input.nextInt();
        recurse(num);
    }

    public static void recurse(int num) {
        int preF = 0 , f = 0;
    }
}