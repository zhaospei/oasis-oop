public class Circle extends Shape {
    protected double radius;

    /**
     * Comment.
     */
    public Circle() {
        super();
        radius = 0.0f;
    }

    /**
     * Comment.
     */
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    /**
     * Comment.
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
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
    public double getArea() { 
        return Math.PI * radius * radius;
    }

    /**
     * Comment.
     */
    public double getPerimeter() {
        return  2.0f * Math.PI * radius;
    }

    /**
     * Comment.
     */
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + ",filled=" + filled + "]";
    }
}
