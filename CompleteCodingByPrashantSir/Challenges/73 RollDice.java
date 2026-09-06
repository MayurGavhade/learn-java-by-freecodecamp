class RollDice {
    public static void main(String[] args) {
        int ranNum = (int) (Math.random() * 10);
        do {
            if(ranNum > 6 || ranNum <= 1) {
               ranNum = (int) (Math.random() * 10);
            }
            break;
        } while(true);
        System.out.print("The dice rolled number is " + ranNum);
    }
}