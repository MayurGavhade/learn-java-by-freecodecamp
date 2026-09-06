package recursion.questions;

public class Q1 {
    public static void main(String[] args) {
        int num = 505;
        System.out.println(sumOfDigit(num));
        System.out.println(productOfDigit(num));
    }

    static int sumOfDigit(int num) {
        if(num == 0) return 0;
        return num%10 + sumOfDigit(num/10);
    }

    static int productOfDigit(int num) {
        if(num%10 == num) return num;
        return (num%10) * productOfDigit(num/10);
    }
}
