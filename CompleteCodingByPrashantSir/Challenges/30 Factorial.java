import java.util.Scanner;

/* program needs to fix
   currently factorial are not in good order
   and also make it in correct order
 */

class Factorial{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        calculateFactorial(input.nextInt());
    }

    public static void calculateFactorial(int num) {
        if (num < 2) {
            System.out.println(1);
        }

        long fact = 1;
        int i =2;
        while(i <= num) {
            fact*=i;
            i++;
        }

        System.out.println(fact);
    }
}