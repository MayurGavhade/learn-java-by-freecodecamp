class BitwiseOperators{
    public static void main(String[] args) {
        int a = 12;
        int b = 5;

        int And = a & b;
        System.out.println(And);

        int Or = a | b;
        System.out.println(Or);

        int XOr = a ^ b;
        System.out.println(XOr);

        int NOr = ~a;
        System.out.println(NOr);

        int LeftShift = a << b;
        System.out.println(LeftShift);

        int RightShift = a >> b;
        System.out.println(LeftShift);

    }
}