public class MotorBike extends Vehicle {
    private boolean hasSidecar;

    /**
     * Comment.
     */
    public MotorBike(String brand, String model, String registrationNumber, 
        Person owner, boolean hasSidecar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSidecar;
    }

    /**
     * Comment.
     */
    public String getInfo() {
        String ans = "Motor Bike:\n";
        ans += "\tBrand: " + super.getBand() + "\n";
        ans += "\tModel: " + super.getModel() + "\n";
        ans += "\tRegistration Number: " + super.getRegistrationNumber() + "\n";
        ans += "\tHas Side Car: " + hasSidecar + "\n";
        ans += "\tBelongs to " + super.getOwner().getName() 
            + " - " + super.getOwner().getAddress() + "\n";
        return ans;
    }

    /**
     * Comment.
     */
    public boolean isHasSidecar() {
        return hasSidecar;
    }

    /**
     * Comment.
     */
    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}
