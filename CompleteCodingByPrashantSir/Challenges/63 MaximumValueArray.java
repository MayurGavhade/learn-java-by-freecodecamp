import java.util.Scanner;

class MaximumIntegerArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to Maximum value in array finder\n");
        System.out.print("Length of Array: ");
        int lengthOfArray = input.nextInt();
        int[] myArr = new int[lengthOfArray];
        for(int i = 0; i < myArr.length; i++) {
            System.out.print("Enter number for this index " + i + ": ");
            myArr[i] = input.nextInt();
        }
        int maximumNum = maximumNum(myArr);
        System.out.print("The maximum number in array is " + maximumNum);
    }
    
    public static int maximumNum(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int arrNum : arr) {
            if(max < arrNum) {
                max = arrNum;
            }
        }
        return max;
    }
}