public class Rectangle extends Shape {
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
    public String toString() {
        return "Rectangle[width=" + width + ",length=" 
                + length + ",color=" + color + ",filled=" + filled + "]";
    }
}
