public class FindMin {
    public static void main(String[] args) {
        int[] arr = {18,12,7,3,14,28};
        System.out.println(findMin(arr));
    }

    static int findMin(int[] arr) {
        int max = Integer.MAX_VALUE;
        for(int element : arr) {
            if(element < max) {
                max = element;
            }
        }
        return max;
    }
}
