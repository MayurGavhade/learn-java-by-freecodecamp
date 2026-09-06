import java.util.Objects;
import java.util.Scanner;

class ReadInputUser {

    // the program takes input from user and until exit it continue to take input


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome back!\n");
        while(true) {
            System.out.println("Enter your input in String(exit): ");
            String text = input.next();
            if(Objects.equals(text, "exit")) {
                break;
            }
        }
    }


}