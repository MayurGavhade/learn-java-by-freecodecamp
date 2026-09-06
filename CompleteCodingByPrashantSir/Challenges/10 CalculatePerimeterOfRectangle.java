import java.util.Scanner;

class CalculatePerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your both sides of ABCD Rectangle:");
        System.out.print("A: ");
        int A = input.nextInt();
        System.out.print("B: ");
        int B = input.nextInt();
        System.out.print("C: ");
        int C = input.nextInt();
        System.out.print("D: ");
        int D = input.nextInt();

        System.out.println("The perimeter of your Rectangle ABCD is: " + (A+B+C+D));
    }
}
