import java.util.Scanner;

class MultiplicationTable{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of which table you want: ");
        table(input.nextInt());
    }

    public static void table(int num){
        int i = 1;
        while (i < 11) {
            System.out.println(num + " * " + i + " = " + num * i);
            i++;
        }
    }
}