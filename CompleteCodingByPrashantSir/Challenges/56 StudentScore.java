import java.util.Scanner;

class StudentScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Student score Categorize");
        System.out.print("Enter you student score: ");
        String result = scoreChecker(input.nextInt());
        System.out.println("Your score is " + result);
    }

    public static String scoreChecker(int num) {
        return num > 80 ? "High" : (num > 50 ? "Moderate" : "Low");
    }
}