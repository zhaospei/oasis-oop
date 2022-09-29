import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String address;
    private List<Vehicle> vehicleList = new ArrayList<Vehicle>();

    /**
     * Comment.
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * Comment.
     */
    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    /**
     * Comment.
     */
    public void removeVehicle(String registrationNumber) {
        for (int i = 0; i < vehicleList.size(); i++) {
            if (vehicleList.get(i).getRegistrationNumber().equals(registrationNumber)) {
                vehicleList.remove(i);
            }
        }
    }

    /**
     * Comment.
     */
    public String getVehiclesInfo() {
        if (vehicleList.size() == 0) {
            return name + " has no vehicle!";
        } else {
            String ans = name + " has:\n";
            ans += "\n";
            for (Vehicle vehicle : vehicleList) {
                ans += vehicle.getInfo();
            }
            return ans;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}