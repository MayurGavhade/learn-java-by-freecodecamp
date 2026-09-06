import java.util.Scanner;

class ArithmaticOfTwoNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first Number: ");
        int firstNum = input.nextInt();
        System.out.print("Enter your second Number: ");
        int secondNum = input.nextInt();

        System.out.println("All the oprators result ");
        System.out.println("+ result " + (firstNum + secondNum));
        System.out.println("- result " + (firstNum - secondNum));
        System.out.println("* result " + (firstNum * secondNum));
        System.out.println("/ result " + (firstNum / secondNum));
        System.out.println("% result " + (firstNum % secondNum));
    }
}
