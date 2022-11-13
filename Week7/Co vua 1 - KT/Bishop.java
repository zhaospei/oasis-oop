public class Bishop extends Piece {
    public Bishop(int x, int y) {
        super(x, y);
    }

    public Bishop(int x, int y, String color) {
        super(x, y, color);

    }

    public String getSymbol() {
        return "B";
    }

    /**
     * Comment.
     */
    public boolean canMove(Board board, int x, int y) {
        boolean check = true;
        if (this.getCoordinatesX() == x && this.getCoordinatesY() == y) {
            return false;
        }
        if (!board.validate(x, y)) {
            check = false;
            return check;
        }
        if (this.getCoordinatesX() + this.getCoordinatesY() != x + y 
            && this.getCoordinatesX() - this.getCoordinatesY() != x - y) {
            check = false;
            return check;
        }
        if (board.getAt(x, y) != null
                && board.getAt(x, y).getColor().equals(this.getColor())) {
            check = false;
            return check;
        }
        if (this.getCoordinatesX() + this.getCoordinatesY() == x + y) {
            if (this.getCoordinatesX() <= x) {
                for (int i = this.getCoordinatesX() + 1; i < x; i++) {
                    if (board.getAt(i, x + y - i) != null) {
                        check = false;
                        return check;
                    }

                }
            } else {
                for (int i = x + 1; i < this.getCoordinatesX(); i++) {
                    if (board.getAt(i, x + y - i) != null) {
                        check = false;
                        return check;
                    }
                }
            }
        }
        if (this.getCoordinatesX() - this.getCoordinatesY() == x - y) {
            if (this.getCoordinatesX() <= x) {
                for (int i = this.getCoordinatesX() + 1; i < x; i++) {
                    if (board.getAt(i, i + y - x) != null) {
                        check = false;
                        return check;
                    }

                }
            } else {
                for (int i = x + 1; i < this.getCoordinatesX(); i++) {
                    if (board.getAt(i, i + y - x) != null) {
                        check = false;
                        return check;
                    }
                }
            }
        }
        return check;
    }
}
