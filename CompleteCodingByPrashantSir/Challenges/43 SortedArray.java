class SortedArray {
    public static void main(String[] args) {
        int[] arr = new int[]{2,5,3,22,55,23};
        boolean isIncreasing = isIncreasing(arr);
        boolean isDecreasing = isDecreasing(arr);
        if(isIncreasing || isDecreasing) {
            System.out.print("The array is sorted");
        } else {
            System.out.print("The array is not sorted");
        }
    }

    public static boolean isIncreasing(int[] arr) {
        int i = 1;
        while(i < arr.length) {
            if(arr[i] < arr[i-1]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isDecreasing(int[] arr) {
        int i = 1;
        while(i < arr.length) {
            if(arr[i] > arr[i-1]) {
                return false;
            }
            i++;
        }
        return true;
    }
}