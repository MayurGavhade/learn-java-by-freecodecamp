import java.util.Scanner;

class GreatestOfTheThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers to compare the greatest: ");
        int first = input.nextInt();
        int second = input.nextInt();
        int third = input.nextInt();

        if (first > second && first > third) {
            System.out.println("The first number is greatest");
        } else if (second > third && second > first) {
            System.out.println("The second number is greatest");
        } else if (third > first && third > second) {
            System.out.println("The third number is greatest");
        } else {
            System.out.println("All numbers are equal");
        }
    }
}