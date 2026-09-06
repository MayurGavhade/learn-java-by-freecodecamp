package sorting.CycleSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void cyclicSort(int[] arr) {
        int start = 0, end = arr.length - 1;
        while(start <= end){
            int temp = arr[arr[start] - 1];
            if (arr[start] > temp || arr[start] < temp) {
                arr[arr[start] - 1] = arr[start];
                arr[start] = temp;
            } else {
                start++;
            }
        }

        
    }
}
