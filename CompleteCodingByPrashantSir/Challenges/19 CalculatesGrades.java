import java.util.Scanner;

class CalculatesGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your marks: ");
        int marks = input.nextInt();
        System.out.println("Out of marks");
        int outOf = input.nextInt();

        double calculatePercent = (double) marks*100/outOf;
        System.out.println(calculatePercent);

        if (calculatePercent >= 90) {
            System.out.println("You got A grade and your percentage is "+ calculatePercent+"%");
        }else if (calculatePercent >= 75) {
            System.out.println("You got B grade and your percentage is "+ calculatePercent+"%");
        }else if (calculatePercent >= 60) {
            System.out.println("You got C grade and your percentage is "+ calculatePercent+"%");
        }else if (calculatePercent >= 30) {
            System.out.println("You got D grade and your percentage is "+ calculatePercent+"%");
        }else {
            System.out.println("You got F grade and your percentage is "+ calculatePercent+"%");
        }
    }
}