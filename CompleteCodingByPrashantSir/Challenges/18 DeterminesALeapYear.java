import java.util.Scanner;

class   DeterminesALeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year to determine if it is a leap year: ");
        int year = input.nextInt();

        if (year%4 == 0 && year%100 != 0){
            System.out.println(year +" is a leap year");
        } else {
            System.out.println(year +" is not a leap year");
        }
    }
}