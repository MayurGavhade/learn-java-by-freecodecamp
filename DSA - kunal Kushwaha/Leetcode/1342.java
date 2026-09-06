package Leetcode;

class StepsToZero {
    static int count = 0;

    public static void main(String[] args) {
        System.out.println(numberOfSteps(0));
    }
    public static int numberOfSteps(int num) {
        if(num == 0) return count;
        ++count;
        if(num%2 == 1) return numberOfSteps((num-1));
        else return numberOfSteps(num/2);
    }
}