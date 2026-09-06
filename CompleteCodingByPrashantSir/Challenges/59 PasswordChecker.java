import java.util.Scanner;

class PasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to password checker\n");
        String password;
        do {
            System.out.print("Enter your 8-digit password: ");
            password = input.next();
        } while (!passwordChecker(password));
        System.out.print("Thanks for entering a valid password\n");
    }

    private static boolean passwordChecker(String pass) {
        return pass.length() > 6;
    }
}