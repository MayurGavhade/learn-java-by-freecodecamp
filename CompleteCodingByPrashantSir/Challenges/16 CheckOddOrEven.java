import java.util.Scanner;

class CheckOddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number to check: ");
        double num = input.nextDouble();

        double checkOddEven = num%2;
        if(checkOddEven == 1) {
            System.out.println("The number is odd");
        } else {
            System.out.println("The number is even");
        }
    }
}