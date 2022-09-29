public class Circle extends Shape {
    protected Point center;
    protected double radius;

    public Circle() {
        super();
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * Comment.
     */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2.0f * Math.PI * radius;
    }

    /**
     * Comment.
     */
    public boolean equals(Object object) {
        if (object instanceof Circle) {
            Circle other = (Circle) object;
            if (this.radius == other.radius && this.center.equals(other.center)) {
                    return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.hashCode();
    }

    /**
     * Comment.
     */
    public String toString() {
        return "Circle[center=" + center.toString() + ",radius=" + radius 
            + ",color=" + super.getColor() + ",filled=" + super.isFilled() + "]";
    }
}
