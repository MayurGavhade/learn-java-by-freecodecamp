import java.util.Scanner;

class GreatestCommonDivisor{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int a = input.nextInt();
        System.out.print("Enter your second number: ");
        int b = input.nextInt();
        calculate(a,b);
    }

    public static void calculate(int a, int b) {
        int i = 2 ;
        boolean istrue = true;
        while(istrue) {
            if(a%i == 0 && b%i == 0) {
                System.out.println("The GCD of following two number is: "+i);
                istrue = false;
            }
            i++;
        }
    }
}