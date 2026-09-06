class Loops{
    public static void main(String[] args) {
//        whileloop();
//        forLoop();
//        doLoop();
//        eachLoop();
        breakAndContinue();
    }

    static void whileLoop() {
        // 1.iterations -> number of times loop runs
        // 2.used -> for non-standard conditions
        // 3.repeating -> block of code while condition is true
        // 4. remember-> always include update to avoid infinite loops
        int i = 0; // initialization
        while (i < 3) { // condition
            System.out.println(i); // actual work
            i++; // updating the condition
        }
    }

    static void forLoop () {
        for(int i = 0; i < 5; i += 2) {
            System.out.println("in for loop " + i);
        }
    }

    static void doLoop() {
        int i = 0;
        System.out.println("before do " + i);
        do{
            i++;
            System.out.println("in do " + i);
        } while (i < 2);

        System.out.println("after do " + i);
    }

    static void eachLoop() {
        String[] names = new String[] {
                "mayur", "ram", "ash", "alok", "rohan"
        };

        for(String name : names) {
            System.out.println(name);
        }
    }

    static void breakAndContinue() {
        int i = 0;
        while(true) {
            i++;
            System.out.println("i in side break " + i);
            if(i >= 5) {
                break;
            }
        }

        for (int j = 0; j < 10; j++) {
            if(j > 5 ) {
                continue;
            }
            System.out.println("j in side continue " + j);
        }
    }
}