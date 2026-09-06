import java.util.Scanner;



 // reattempt this challenge
class ReverseDigits{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number to be reversed: ");
        reverseNumber(input.nextInt());
    }

    public static void reverseNumber(int num) {
        int reversed = 0;
        while(num > 0) {
            reversed = num%10;
            num = num/10;
            System.out.print(reversed);
        }
    }
}