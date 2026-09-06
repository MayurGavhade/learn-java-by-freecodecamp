package sorting.InsertionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Method of insertion sort
    private static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j-1]) {
                    int swap = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = swap;
                } else {
                    break;
                }
            }
        }
    }
}
