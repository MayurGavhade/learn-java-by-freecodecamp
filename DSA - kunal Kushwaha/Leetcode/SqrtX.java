package Leetcode;

// Leetcode problem no. 69. Sqrt(X)
public class SqrtX {
    // not solved my me at first time

    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }
    static int mySqrt(int x) {
        if (x < 2) return x;
        long left = 1, right = x / 2;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (mid * mid == x) return (int) mid;
            if (mid * mid < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return (int) right;
    }
}
