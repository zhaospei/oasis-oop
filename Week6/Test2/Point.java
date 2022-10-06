public class Point {
    private double pointX;
    private double pointY;
   
    public Point(double x, double y) {
        this.pointX = x;
        this.pointY = y;
    }

    public double getPointX() {
        return pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointX(double x) {
        this.pointX = x;
    }

    public void setPointY(double y) {
        this.pointY = y;
    }

    public double distance(Point other) {
        return Math.sqrt((this.pointX - other.pointX) * (this.pointX - other.pointX) 
            + (this.pointY - other.pointY) * (this.pointY - other.pointY));
    }
}
