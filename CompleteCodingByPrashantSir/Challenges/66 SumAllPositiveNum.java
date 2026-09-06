import java.util.Scanner;

class SumAllPositiveNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to positive number addition\n");
        System.out.print("Enter number of digit you want(e.g. 5): ");
        int noOfDigit = input.nextInt();
        int[] arr = new int[noOfDigit];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter your number for index " + i + " : ");
            arr[i] = input.nextInt();
        }
        int num = sumNum(arr);
        System.out.println("The sum is " + num);
    }

    public static int sumNum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if(num < 0) {
                continue;
            }
            sum += num;
        }
        return sum;
    }
}