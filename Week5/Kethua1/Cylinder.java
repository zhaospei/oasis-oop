public class Cylinder extends Circle {
    private double height = 1.0f;
    
    /**
     * Comment.
     */
    public Cylinder() {
        super();
        height = 1.0f;
    }

    /**
     * Comment.
     */
    public Cylinder(double radius) {
        super(radius);
    }

    /**
     * Comment.
     */
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    /**
     * Comment.
     */
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    /**
     * Comment.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Comment.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Comment.
     */
    public double getVolume() {
        return this.getArea() * height;
    }

    /**
     * Comment.
     */
    public String toString() {
        return "Cylinder[" + super.toString() + "," + height + "]";  
    } 

    /**
     * Comment.
     */
    public double getArea() {
        return 2 * super.getArea() + 2 * PI * super.getRadius() * height; 
    }
}
