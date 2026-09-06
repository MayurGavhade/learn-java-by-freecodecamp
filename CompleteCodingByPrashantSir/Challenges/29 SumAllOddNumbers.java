import java.util.Scanner;

class SumOddNumbers{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to sum odd upto: ");
        sumOdd(input.nextInt());
    }

    public static void sumOdd(int num) {
        int i = 1;
        int j = 0;
        while(i <= num) {
            if (i%2 == 1) {
                j = j + i;
            }
            i++;
        }
        System.out.println("the sum of all odd numbers upto "+num+ " is " +j);
    }
}