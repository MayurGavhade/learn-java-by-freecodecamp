import java.util.Scanner;

class Armstrong{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check it is Armstrong number: ");
        /*a armstrong is like example, 153
        * last digit of number is 3
        * saparate number in saparate digit 1 + 5 + 3
        * now raised each to power of last digit 3
        * 1^3 + 5^3 + 3^3 = 153
        * it should be the same number 153*/ //check it out for armstrong number
        boolean isArmstrongNumber = isArmstrongNumber(input.nextInt());
        if(isArmstrongNumber) {
            System.out.println("Your number is Armstrong");
        } else {
            System.out.println("Your number is not Armstrong");
        }
    }

    public static boolean isArmstrongNumber(int num) {
        int noOfDigits = noOfDigit(num);
        int numCopy = num;
        int finalNumber = 0;
        while (num > 0) {
            int digit = num % 10;
            num /= 10;
            finalNumber += power(digit,noOfDigits);
        }
        return finalNumber == numCopy;
    }

    public static int power(int num1, int num2) {
        int result = 1;
        int i = 0;
        while(i < num2) {
            result *= num1;
            i++;
        }
        return result;
    }

    public static int noOfDigit(int num) {
        int digits = 0;
        while (num > 0) {
            digits++;
            num /= 10;
        }
        return digits;
    }
}