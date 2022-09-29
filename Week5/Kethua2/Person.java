public class Person {
    private String name;
    private String address;

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
    public String getName() {
        return name;
    }

    /**
     * Comment.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Comment.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Comment.
     */
    public String toString() {
        return "Person[name=" + name + ",address=" + address + "]";
    }
}