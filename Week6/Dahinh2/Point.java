public class Point {
    private double pointX;
    private double pointY;

    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    public double distance(Point other) {
        return Math.sqrt((this.pointX - other.pointX) * (this.pointX - other.pointX) 
                + (this.pointY - other.pointY) * (this.pointY - other.pointY));
    }

    /**
     * Comment.
     */
    public boolean equals(Object object) {
        if (object instanceof Point) {
            Point other = (Point) object;
            if (other.pointX == this.pointX && other.pointY == this.pointY) {
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
        return "(" + pointX + "," + pointY + ")";
    }
}
