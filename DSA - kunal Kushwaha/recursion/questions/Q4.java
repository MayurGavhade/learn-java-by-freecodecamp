package recursion.questions;

public class Q4 {

    static int sum = 0;
    static int revN(int num){
        int digit = (int)(Math.log10(num)) + 1;
        return helper(num,digit);
    }
    private static int helper(int n, int digits) {
        if (n%10 == n) return n;
        int rem = n % 10;
        return rem * (int)(Math.pow(10,digits - 1)) + helper(n/10,digits);
    }
    static boolean palin(int n) {
        return n == revN(n);
    }

    public static void main(String[] args) {
        System.out.println(palin(101));
    }
}
