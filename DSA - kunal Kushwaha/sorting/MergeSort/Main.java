package sorting.MergeSort;

import java.util.Arrays;

public class Main {
    // merge sort is like used with recursion break array into smaller
    // parts and solve or sort them 

    // this is merge sort by creating new objects each time
    
    public static void main(String[] args) {
        int[] nums = {8,3,4,12,5,6};
        int[] newNums = mergeSort(nums);
        System.out.print(Arrays.toString(newNums));
    }

    static int[] mergeSort(int[] arr) {
        if(arr.length == 1) {
            return arr;
        } 
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0, j = 0, k = 0;

        while(i < first.length && j < second.length) {
            if(first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        while(i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        while(j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    } 


    /*
    Time complexity: O(N * log(N))
    space complexity: O(N)
    */
}
