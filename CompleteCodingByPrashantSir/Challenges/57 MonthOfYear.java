import java.util.Scanner;

class MonthOfYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to find month of year");
        System.out.print("Enter no. to find month in year: ");
        String monthName = month(input.nextInt());
        System.out.print("The month is " + monthName);
    }

    public static String month(int num) {
        return switch (num) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid number";
        };
    }
}