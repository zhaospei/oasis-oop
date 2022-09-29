public class Staff extends Person {
    private String school;
    private double pay;

    /**
     * Comment.
     */
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    /**
     * Comment.
     */
    public String getSchool() {
        return school;
    }

    /**
     * Comment.
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * Comment.
     */
    public double getPay() {
        return pay;
    }

    /**
     * Comment.
     */
    public void setPay(double pay) {
        this.pay = pay;
    }

    /**
     * Comment.
     */
    public String toString() {
        return "Staff[" + super.toString() + ",school=" + school + ",pay=" + pay + "]";
    }
}
