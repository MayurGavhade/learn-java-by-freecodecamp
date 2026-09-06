import java.util.Scanner;

class AreaCircumferenceCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to Area and Circumference of circle calculator\n");
        System.out.print("Enter the radius of circle: ");
        calculateCircle(input.nextInt());
    }

    public static void calculateCircle(int radius) {
        double area = 2 * Math.PI * radius;
        double circumference = Math.PI * Math.pow(radius , 2);
        System.out.printf("The area of circle is %f and circumference is %f",area,circumference);
    }
}