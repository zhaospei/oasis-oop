public class Square extends Rectangle {
    /**
     * Comment.
     */
    public Square() {
        super();
    }

    /**
     * Comment.
     */
    public Square(double side) {
        super(side, side);
    }

    /**
     * Comment.
     */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    /**
     * Comment.
     */
    public double getSide() {
        return super.width;
    }

    /**
     * Comment.
     */
    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    /**
     * Comment.
     */
    @Override
    public void setWidth(double side) {
        this.width = side;
        this.length = side;
    }

    /**
     * Comment.
     */
    @Override
    public void setLength(double side) {
        this.width = side;
        this.length = side;
    }

    /**
     * Comment.
     */
    public String toString() {
        return "Square[side=" + width + ",color=" + color + ",filled=" + filled + "]";
    }
}
