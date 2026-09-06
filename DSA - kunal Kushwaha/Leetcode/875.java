package Leetcode;

class KokoEatingBananas {
    public static void main(String[] args) {
        // First test case
        int[] piles = {3,6,7,11};
        int h = 8;
        System.out.printf("The minimum hour is %s",minEatingSpeed(piles,h));
    }
    static int minEatingSpeed(int[] piles, int h) {
        int start = 0;
        int end = greatestNum(piles);
        int i = 0;
        int amount = piles[i];
        while(true) {
            int mid = start + (end - start)/2;
            if(amount <= mid) {
                h = h - 1;
            } else {
                h = h - 1;
                amount = +(amount - mid);
            }
            if(h >= 0) {
                end = mid - 1;
            }
            if(h < 1) {
                break;
            }
            i++;
        }
        return end;
    }

    static int greatestNum(int[] nums) {
        int num = nums[0] , i = 1;
        while(i < nums.length) {
            if(nums[i-1] < nums[i]) {
                num = nums[i];
            }
            i++;
        }
        return num;
    }
}