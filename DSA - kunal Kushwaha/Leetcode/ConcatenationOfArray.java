package Leetcode;

import java.util.Arrays;

class Solution {

    public static void main(String[] args) {
        int[] arr = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }
    public static int[] getConcatenation(int[] nums) {
        int lengthOfAns = 2 * nums.length;
        int[] ans = new int[lengthOfAns];
        for(int i = 0; i < lengthOfAns; i++) {
            if(i == nums.length){ // Special condition for element just next after last element of original nums array.
                ans[i] = nums[0];
            } else if (i > nums.length - 1) {
                ans[i] = nums[i - nums.length];
            } else {
                ans[i] = nums[i];
            }
        }
        return ans;
    }
}
