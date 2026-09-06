package sorting.BubbleSort;

import java.util.Arrays;

public class Code {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void bubbleSort(int[] nums) {
        boolean swapped;
        // run the steps n-1 times
        for(int i = 0; i < nums.length - 1; i++) {
            swapped = false;
            // for each step, max item will come at the last respective index
            for (int j = 1; j < nums.length - i; j++) {
                // swap if the item is smaller than the previous item
                if(nums[j] < nums[j-1]) {
                    // swap
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    swapped = true;
                }
            }

            // if you did not swap for a particular value of i, it means the array is sorted hence stop the program.
            if(!swapped) {
                break;
            }
        }
    }
}
