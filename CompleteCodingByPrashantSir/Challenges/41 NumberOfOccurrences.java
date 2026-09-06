class NumberOfOccurrences{
    public static void main(String[] args) {
        int[] arr = new int[]{1 , 2,3,3,55,55,23,10};
        occur(arr);
    }

    public static void occur(int[] arr) {
        int i = 0;
        int count = 0;
        while(i < arr.length) {
            int j = 0;
            count = 0;
            while (j < arr.length) {
                if (arr[i] == arr[j]) {
                   count += 1;
                }
                j++;
            }
            System.out.println("the number "+arr[i]+" is occur "+count+" times");
            i++;
        }
    }
}