package recursion.util;
import java.util.Scanner;

public class Arrays {
    public int[] arrayCreate(int size) {
        int[] arr = new int[size];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
