package sorting.QuickSort;

import java.util.Arrays;

public class Main {
    /*
    ? what is pivot
    * choose any element after first pass all the elements less than pivot
    * will be on the left side of pivot
    * & elements grater than pivot will be on right side of pivot
    */

    /* 
    ? How to put pivot at correct position ?
    *Mechanism: Uses two pointers starting from the array ends.
    *Finding Violations:
    *    The start pointer identifies elements larger than the pivot.
    *    The end pointer identifies elements smaller than the pivot.
    *    When violations occur, the elements are swapped to fix their relative positions.
    */

    /*
    ? how to pick pivot
    *Pivots can be chosen as the first element, last element, middle element, or a random index.
    */

    /*
    ? Complexity Analysis
    *Worst Case: complexity,O(N^2) occurring when the pivot
    *is consistently the smallest or largest element.

    *Best Case: complexity,O(NlogN) occurring when the pivot
    *consistently divides the array into two equal halves.
    */


    public static void main(String[] args) {
        int[] arr = {8,5,2,4,1,6};
        // sort(arr, 0, arr.length - 1);
        // System.out.print(Arrays.toString(arr));

        // * java built in sort method
        Arrays.sort(arr);
        System.out.print(Arrays.toString(arr));
    }

    static void sort(int[] nums, int low , int high) {
        if(low >= high) {
            return;
        }
        int s = low;
        int e = high;

        int mid = s + (e - s) / 2;
        int pivot = nums[mid];

        while(s <= e) {
            while(nums[s] < pivot) {
                s++;
            }
            while(nums[e] > pivot) {
                e--;
            }
            if(s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        sort(nums, low, e);
        sort(nums, s, high);
    }
}
