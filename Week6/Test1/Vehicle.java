public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected String registrationNumber;
    protected Person owner;

    /**
     * Comment.
     */
    public Vehicle(String brand, String model, String registrationNumber, Person owner) {
        this.brand = brand;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.owner = owner;
    }

    /**
     * Comment.
     */
    public abstract String getInfo();

    /**
     * Comment.
     */
    public void transferOwnership(Person newOwner) {
        this.owner = newOwner;
    }

    /**
     * Comment.
     */
    public String getBand() {
        return brand;
    }

    /**
     * Comment.
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Comment.
     */
    public String getModel() {
        return model;
    }

    /**
     * Comment.
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Comment.
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Comment.
     */
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /**
     * Comment.
     */
    public Person getOwner() {
        return owner;
    }

    /**
     * Comment.
     */
    public void setOwner(Person owner) {
        this.owner.removeVehicle(registrationNumber);
        this.owner = owner;
        owner.addVehicle(this);
    }
} 