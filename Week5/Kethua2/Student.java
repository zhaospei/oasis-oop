public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    /**
     * Comment.
     */
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    /**
     * Comment.
     */
    public String getProgram() {
        return program;
    }

    /**
     * Comment.
     */
    public void setProgram(String program) {
        this.program = program;
    }

    /**
     * Comment.
     */
    public int getYear() {
        return year;
    }

    /**
     * Comment.
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Comment.
     */
    public double getFee() {
        return fee;
    }

    /**
     * Comment.
     */
    public void setFee(double fee) {
        this.fee = fee;
    }

    /**
     * Comment.
     */
    public String toString() {
        return "Student[" + super.toString() + ",program=" + program
                + ",year=" + year + ",fee=" + fee + "]";
    }
}
