import java.util.Scanner;

class NumberOfOccurrencesForEach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to Occurrences of elements\n");
        System.out.print("Enter length of array: ");
        int arrLength = input.nextInt();
        int[] arr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            System.out.println("Enter your " + (i+1) + " element: ");
            arr[i] = input.nextInt();
        }
        System.out.print("Now, Enter your number want to search: ");
        int element = input.nextInt();
        occurrences(arr , element);
    }

    public static void occurrences(int[] arr , int element) {
        int numOccur = 0;
        for(int num : arr) {
            if(element == num) {
              numOccur++;
            }
        }
        System.out.print("The number " + element + " occur "+ numOccur);
    }
}