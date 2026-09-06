import java.util.Scanner;

class AreaOfTriangle{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your triangle breath in meter: ");
        int B = input.nextInt();
        System.out.println("Enter your triangle height in meter: ");
        int H = input.nextInt();

        System.out.println("The area of triangle is: " + (0.5 * B * H) + " meter");
    }
}