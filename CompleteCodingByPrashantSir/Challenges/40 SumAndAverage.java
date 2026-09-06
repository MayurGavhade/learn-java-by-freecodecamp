class SumAndAverage {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        int sum = sum(arr);
        System.out.println("The sum of Array is: "+ sum);
        int average = average(arr);
        System.out.println("The average of Array is: "+ average);
    }

    public static int sum (int[] arr) {
        int i = 0;
        int sum = 0;
        while (i < arr.length) {
            sum = sum + arr[i];
            i++;
        }
        return sum;
    }

    public static int average(int[] arr) {
        int i = 0;
        int average = 0;
        while (i < arr.length) {
            average = average + arr[i];
            i++;
        }
        return (average)/arr.length;
    }
}