public class Circle {
    private double radius  = 1.0f;
    private String color = "red";

    protected static final double PI = 3.14f;

    /**
     * Comment.
     */
    public Circle() {
        radius = 1.0f;
        color = "red";
    }

    /**
     * Comment.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Comment.
     */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    /**
     * Comment.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Comment.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Comment.
     */
    public String getColor() {
        return color;
    }

    /**
     * Comment.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Comment.
     */
    public double getArea() {
        return PI * radius * radius;
    }

    /**
     * Comment.
     */
    public String toString() {
        return "Circle[" + radius + "," + color + "]";  
    }
}