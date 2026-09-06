import java.util.Scanner;

class MultiplicationTableForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to Multiplication table\n");
        System.out.print("Enter number of table you want: ");
        int num = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num*i);
        }
    }
}