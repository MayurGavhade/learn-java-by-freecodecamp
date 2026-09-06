package MathsforDSA.Bitwise.projects;

public class Question09 {
    public static void main(String[] args) {
        int n = 5;
        int ans = magicNumber(n);
        System.out.printf("%d\n",ans);
    }

    public static int magicNumber(int num) {
        int ans = 0;
        int base = 5;
        while(num > 0) {
            int last = num & 1;
            num = num >> 1;
            ans = ans + last * base;
            base = base * 5;
        }
        return ans;
    }
}
