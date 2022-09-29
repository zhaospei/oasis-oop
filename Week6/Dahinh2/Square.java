public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);
    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    /**
     * Comment.
     */
    public String toString() {
        return "Square[topLeft=" + topLeft.toString() + ",side=" + super.getWidth() 
            + ",color=" + super.getColor() + ",filled=" + super.isFilled() + "]";
    }

    /**
    * Comment.
    */
    public boolean equals(Object object) {
        if (object instanceof Square) {
            Rectangle other = (Square) object;
            if (this.width == other.width && this.topLeft.equals(other.topLeft)) {
                return true;
            }
        }
        return false;
    }

}
