import java.util.Scanner;

class MinimumOfTwo{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to Minimum number checker \n");
        System.out.print("Enter your first number: \n");
        int first = input.nextInt();
        System.out.print("Enter your second number: \n");
        int second = input.nextInt();

        int compare = compare(first,second);
        System.out.print(compare+" is the minimum number");
    }

    public static int compare(int first,int second) {
        return (first < second ? first : second);
    }
}