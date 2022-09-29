public abstract class Shape {
    protected String color;
    protected boolean filled;

    /**
     * Comment.
     */
    public Shape() {
        color = null;
        filled = false;
    }

    /**
     * Comment.
     */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
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
    public boolean isFilled() {
        return filled;
    }

    /**
     * Comment.
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * Comment.
     */
    public abstract double getArea();

    /**
     * Comment.
     */
    public abstract double getPerimeter();

    /**
     * Comment.
     */
    public String toString() {
        return "Shape[color=" + color + ",filled=" + filled + "]";
    }
}
