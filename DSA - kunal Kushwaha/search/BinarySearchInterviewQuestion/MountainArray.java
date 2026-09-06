package search.BinarySearchInterviewQuestion;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,10,2,4,6};
        System.out.println(binarySearch(arr));
    }

    static int binarySearch(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid+1]) {
                end = mid;
            } else if(arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
        }
        return start;
    }
}
