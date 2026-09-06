class MaximumAndMinimum{
    public static void main(String[] args) {
        int[] arr = new int[]{2,5,3,22,55,23};
        int max = max(arr);
        int min = min(arr);
        System.out.println("The maximum number of array: "+max);
        System.out.println("The minimum number of array: "+min);
    }

    public static int max(int[] arr) {
        int max = 0;
        int i = 1;
        int j = 0;
        while(i < arr.length) {
            if(arr[i] > arr[j]) {
                max = arr[i];
            }
            j++;
            i++;
        }
        return max;
    }

    public static int min(int[] arr) {
        int min = 0;
        int i = 0;
        int j = 1;
        while(i < arr.length) {
            if(arr[i] < arr[j]) {
               min = arr[i];
               j--;
            }
            j++;
            i++;
        }
        return min;
    }
}