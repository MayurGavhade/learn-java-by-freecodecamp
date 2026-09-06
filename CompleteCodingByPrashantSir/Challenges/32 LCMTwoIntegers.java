import java.util.Scanner;

class LeastCommonMultiple{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers for LCM: ");
        calculate(input.nextInt(),input.nextInt());
    }

    public  static  void calculate(int a,int b) {
        int i = 1;
        boolean istrue = true;
        while(istrue) {
            if(i%a == 0 && i%b == 0) {
                System.out.println(i);
                istrue = false;
            }
            i++;
        }
    }
}