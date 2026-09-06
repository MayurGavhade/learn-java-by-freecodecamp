import java.util.Scanner;

class CheckPrimeNumber{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check if it is Prime: ");
        boolean isTrue = checkPrime(input.nextInt());
        if(isTrue){
            System.out.println("the given number is prime");
        } else {
            System.out.println("the given number is not prime");
        }

    }

    public static boolean checkPrime(int num) {
        int i = 2;
        String message = "";
        while (i < num) {
            if(num%i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}