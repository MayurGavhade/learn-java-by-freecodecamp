import java.util.Scanner;

class CheckNumbersSign{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number to check sign: ");
        int num = input.nextInt();

        if(num == 0){
            System.out.println("The number is zero");
        } else if (num < 0) {
            System.out.println("The number has negative sign");
        } else  {
            System.out.println("The number has positive sign");
        }

    }
}