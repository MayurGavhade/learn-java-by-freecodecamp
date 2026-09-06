class  FunctionsMethods{
    public static void main(String[] args) {
        System.out.println(sum(2,3));
        System.out.print(sum(6,1));
    }

    // this is a method or Function
    static int sum(int a,int b) {
        int addition = a + b;
        return addition; // return value must match type method (in case int)
    }

    // void function means return null or nothing

}