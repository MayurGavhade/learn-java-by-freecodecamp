import java.util.Scanner;

class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Simple calculator");
        System.out.println("Enter no. of operator: \n 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division");
        int operator = input.nextInt();
        System.out.println("Enter first number: ");
        int first = input.nextInt();
        System.out.println("Enter second number: ");
        int second = input.nextInt();
        int calculate = calculate(operator,first,second);
        if(calculate == 0) {
            System.out.println("Invalid operator");
        } else {
            System.out.println("The result is " + calculate);
        }
    }

    public static int calculate(int operator,int num1,int num2) {
        return switch (operator) {
            case 1 -> num1 + num2;
            case 2 -> num1 - num2;
            case 3 -> num1 * num2;
            case 4 -> num1 / num2;
            default -> 0;
        };
    }
}