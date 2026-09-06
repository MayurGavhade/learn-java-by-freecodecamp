import java.util.Scanner;

class CategorizeByAge{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age to find your group: ");
        byte age = input.nextByte();

        if (age >= 60) {
            System.out.println("You are Senior citizen :)");
        } else if (age >= 20 ) {
            System.out.println("You are Adult citizen :)");
        } else if (age >= 13) {
            System.out.println("You are Teen citizen :)");
        } else {
            System.out.println("You are child citizen :)");
        }
    }
}