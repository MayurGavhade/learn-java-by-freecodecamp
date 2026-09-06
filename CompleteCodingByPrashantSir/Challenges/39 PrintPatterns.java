import java.util.Scanner;

class PrintPatterns{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. of rows to print: ");
        printStars(input.nextInt());
    }

    public static void printStars(int num) {
        int rows = 0;
        while(rows < num+1) {
            int i = 0;
            while(i < rows) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows++;
        }
    }
}