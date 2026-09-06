package search.BinarySearchInterviewQuestion;

public class SubSplitArray {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        System.out.println(splitArray(arr,2));
    }

    // The method will give minimum of two split array.
    static int splitArray(int[] arr, int m) {
        // this two variable is initialized
        int start = 0;
        int end = 0;

        // Simple linear search for start and end from arr.
        for(int i = 0; i < arr.length; i++) {
            start = Math.max(start,arr[i]); // start will be highest in array
            end = end + arr[i]; // end will be sum of array
        }

        // Binary Search from will be applied.
        while (start < end) {
            // mid will be initialized.
            int mid = start + (end - start)/2;

            int sum = 0, pieces = 1; // Sum and pieces is initialized.

            // For loop for each item in array
            for(int num : arr) {

                if(sum + num > mid) {
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if (pieces > m) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        // Start will be equal to end
        return end;
    }

}
