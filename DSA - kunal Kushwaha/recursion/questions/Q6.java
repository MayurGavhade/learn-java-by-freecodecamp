public class Q6 {
    public static void main(String[] args) {
        triangleOne(5);
    }

    static void triangleOne(int num) {
        for(int i = 0; i <  num; i++) {
            System.out.printf("*");
        }
        if(num > 0) {
            System.out.printf("\n");
            triangleOne(num - 1);
        }
    }

    static void triangleTwo(int num) {
        
    }
}