package recursion.questions;

public class Q2 {
    static int sum = 0;
    static void reverseNum(int num){
        if(num == 0) return;
        int rem = num%10;
        sum = sum * 10 + rem;
        reverseNum(num/10);
    }

    public static void main(String[] args) {
        reverseNum(12345);
        System.out.println(sum);
    }
}
