package in.java.AbstractOOP;

public class Car extends Vehicle {
    private int noOfDoors;
    public Car() {
        super(4);
    }

    @Override
    public void makeStartSound() {
        System.out.print("Vrooommmmmm....");
    }

    @Override
    public void getSetGo() {
        System.out.println("Ready to go nowwww....");
    }
}
