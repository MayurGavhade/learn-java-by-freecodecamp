package MathsforDSA.Bitwise.projects;

public class Question11 {
    public static void main(String[] args) {
        int n = 7;
        int newN = 1 << (n - 1);
        System.out.println(newN);
    }
}