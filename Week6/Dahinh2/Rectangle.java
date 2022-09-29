public class Rectangle extends Shape {
    protected Point topLeft;
    protected double width;
    protected double length;

    /**
     * Comment.
     */
    public Rectangle() {
        super();
        width = 0.0f;
        length = 0.0f;
    }

    /**
     * Comment.
     */
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    /**
     * Comment.
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /**
     * Comment.
     */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.topLeft = topLeft;
        this.width = width;
        this.length = length;
    }

    /**
     * Comment.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Comment.
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Comment.
     */
    public double getLength() {
        return length;
    }

    /**
     * Comment.
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Comment.
     */
    public double getArea() {
        return width * length;
    }

    /**
     * Comment.
     */
    public double getPerimeter() {
        return 2.0f * (width + length);
    }

    /**
     * Comment.
     */
    public Point getTopLeft() {
        return topLeft;
    }

    /**
     * Comment.
     */
    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    /**
     * Comment.
     */
    public boolean equals(Object object) {
        if (object instanceof Rectangle) {
            Rectangle other = (Rectangle) object;
            if (this.width == other.width && this.length == other.length 
                    && this.topLeft.equals(other.topLeft)) {
                        return true;
            }
        }
        return false;
    }

    /**
     * Comment.
     */
    public int hashCode() {
        return this.hashCode();
    }

    /**
     * Comment.
     */
    public String toString() {
        return "Rectangle[topLeft=" + topLeft.toString() + ",width=" 
            + this.width + ",length=" + this.length + ",color=" + getColor() 
            + ",filled=" + isFilled() + "]";
    }
}
