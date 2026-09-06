class PrintStars{
    public static void main(String[] args) {
        printStar(5);
    }

    public static void printStar(int i) {
        int init = 0;

        while(init < i) {
            System.out.print("*");
            int j = 0;
            while(j < init) {
                System.out.print(" *");
                j++;
            }
            System.out.println();
            init++;
        }
    }
}