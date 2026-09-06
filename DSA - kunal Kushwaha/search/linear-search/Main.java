public class Main {
    public static void main(String[] args) {
        int[] nums = {23,1,4,2,6,7,35};
        int target = 6;
        int ans = linearSearch(nums,target);
        System.out.println(ans);
    }

    // search the target and return the true or false
    static boolean linearSearch3(int[] arr, int target) {
        if(arr.length == 0) {
            return false;
        }

        //run a forEachLoop
        for (int element: arr) {
            // check for element at every index if it is = target
            if(element == target) {
                return true;
            }
        }

        // this line will execute if none of the return statement above have executed
        // hence the target not found
        return false;
    }

    // search the target and return the element
    static int linearSearch2(int[] arr, int target) {
        if(arr.length == 0) {
            return Integer.MAX_VALUE;
        }

        //run a forEachLoop
        for (int element: arr) {
            // check for element at every index if it is = target
            if(element == target) {
                    return element;
            }
        }

        // this line will execute if none of the return statement above have executed
        // hence the target not found
        return Integer.MAX_VALUE;
    }

    // search in the array; return the index if item found
    // otherwise if item not found return -1

    static int linearSearch(int[] arr, int target) {
        if(arr.length == 0) {
            return -1;
        }

        //run a forLoop
        for (int i = 0; i < arr.length; i++) {
            // check for element at every index if it is = target
            int element = arr[i];
            if(element == target) {
                return i;
            }
        }

        // this line will execute if none of the return statement above have executed
        // hence the target not found
        return -1;
    }
}
