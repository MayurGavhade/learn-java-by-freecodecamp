package recursion.questions;
import recursion.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        Arrays arrays = new Arrays();
        int[] arr = arrays.arrayCreate(5);

        int ans = findElement(arr, 18, 1);
        System.out.printf("index: %d\n",ans);
    }

    static int findElement(int[] arr, int target, int i) {
        if(i >= arr.length) {
            return -1;
        }
        if(arr[i] == target) {
            return i;
        }
        return findElement(arr, target, i + 1);
    }
}
