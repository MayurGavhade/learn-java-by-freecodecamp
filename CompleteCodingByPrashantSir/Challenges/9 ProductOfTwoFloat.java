import java.util.Scanner;

class ProductOfTwoFloatNumbers{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first float number: ");
        float firstNum = input.nextFloat();
        System.out.println("Enter your second float number: ");
        float secondNum = input.nextFloat();

        System.out.print("Result of two floating point number: " + (firstNum * secondNum ));
    }
}