class ArrayIntoSingleString {
    public static void main(String[] args) {
        String[] arr = new String[] {"Hi","There,","how","are","you"};
        StringBuilder result = stringBuilder(arr);
        System.out.print(result);
    }

    public static StringBuilder stringBuilder(String[] arr) {
        StringBuilder build = new StringBuilder();
        for (String s : arr) {
            build.append(s).append(" ");
        }
        return build;
    }
}