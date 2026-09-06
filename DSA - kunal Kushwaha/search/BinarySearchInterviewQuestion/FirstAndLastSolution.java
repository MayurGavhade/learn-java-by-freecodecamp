package search.BinarySearchInterviewQuestion;
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

import java.util.Arrays;

public class FirstAndLastSolution {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] result = binarySearch(nums , target);
        System.out.println(Arrays.toString(result));
    }

    static int[] binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int mid = start + (end - start)/2;
            if(mid <= target) {
                start = mid + 1;
            } else if (mid >= target) {
                end = mid - 1;
            } else {
                return new int[] {start,end};
            }
        }

        return new int[] {start,end};
    }
}
