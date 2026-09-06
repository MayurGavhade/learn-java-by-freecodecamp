import java.util.Scanner;

class EvenOdd{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to even or odd checker! \n");
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        boolean compare = compare(num);
        System.out.println(compare ? "the number is even" : "the number is odd");
    }

    public static boolean compare(int num){
        return num % 2 == 0;
    }
}