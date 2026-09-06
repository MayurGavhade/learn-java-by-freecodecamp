import java.util.Scanner;

class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a given number: ");

        int digitSum = sum(input.nextInt());
        System.out.println("the sum of digits is: "+ digitSum);
    }

    public static int sum(int num) {
        int sum = 0;
        while(num > 0) {
            sum = sum + num%10;
            num = num /10;
        }
        return sum;
    }
}