import java.util.Scanner;

class AbsoluteValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to Absolute Value\n");
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        int finalValue = Absolute(num);
        System.out.println("The absolute value of given number is: " + finalValue);
    }

    public static int Absolute(int num) {
        return num >= 0 ? num : -1 * num;
    }
}