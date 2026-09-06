package search.BinarySearchAlgorithm;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = new int[] {-1,0,3,5,9,12};
        int target = 9;
    }

    static int binaryIndex(int[] nums, int target) {
        int startPoint = 0;
        int endPoint = nums.length - 1;
        int middleNum = (int) ((startPoint + endPoint)/2);

        if(middleNum == target) {
            return middleNum;
        } else if (target > middleNum) {
            endPoint = middleNum;
        }
        return -1;
    }
}
