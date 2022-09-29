public class Car extends Vehicle {
    private int numberOfDoors;

    /**
     * Comment.
     */
    public Car(String brand, String model, String registrationNumber, 
        Person owner, int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * Comment.
     */
    public String getInfo() {
        String ans = "Car:\n";
        ans += "\tBrand: " + super.getBand() + "\n";
        ans += "\tModel: " + super.getModel() + "\n";
        ans += "\tRegistration Number: " + super.getRegistrationNumber() + "\n";
        ans += "\tNumber of Doors: " + numberOfDoors + "\n";
        ans += "\tBelongs to " + super.getOwner().getName() 
            + " - " + super.getOwner().getAddress() + "\n";
        return ans;
    }

    /**
     * Comment.
     */
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    /**
     * Comment.
     */
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
