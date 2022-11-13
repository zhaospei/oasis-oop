public abstract class Piece {
    private int coordinatesX;
    private int coordinatesY;
    private String color;

    /**
     * Comment.
     */
    public Piece(int x, int y) {
        this.coordinatesX = x;
        this.coordinatesY = y;
    }

    /**
     * Comment.
     */
    public Piece(int x, int y, String color) {
        this.coordinatesX = x;
        this.coordinatesY = y;
        this.color = color;
    }

    public abstract String getSymbol();

    public abstract boolean canMove(Board board, int coordinatesX, int coordinatesY);

    public int getCoordinatesX() {
        return coordinatesX;
    }

    public void setCoordinatesX(int x) {
        coordinatesX = x;
    }

    public int getCoordinatesY() {
        return coordinatesY;
    }

    public void setCoordinatesY(int y) {
        coordinatesY = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Comment.
     */
    public boolean checkPosition(Piece piece) {
        boolean check = coordinatesX >= 1 && coordinatesY >= 1
                && coordinatesX <= 8 && coordinatesY <= 8;
        return check;
    }
}
