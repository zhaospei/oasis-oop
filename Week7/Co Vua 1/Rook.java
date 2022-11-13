public class Rook extends Piece {
    public Rook(int x, int y) {
        super(x, y);
    }

    public Rook(int x, int y, String color) {
        super(x, y, color);

    }

    public String getSymbol() {
        return "R";
    }

    /**
     * Comment.
     */
    public boolean canMove(Board board, int x, int y) {
        boolean check = true;
        if (!board.validate(x, y)) {
            check = false;
            return check;
        }
        if (this.getCoordinatesX() != x && this.getCoordinatesY() != y) {
            check = false;
            return check;
        }
        if (board.getAt(x, y) != null
                && board.getAt(x, y).getColor().equals(this.getColor())) {
            check = false;
            return check;
        }
        if (x == this.getCoordinatesX()) {
            if (this.getCoordinatesY() <= y) {
                for (int i = 1; i < y - this.getCoordinatesY(); i++) {
                    int k = this.getCoordinatesY() + i;
                    if (board.getAt(x, k) != null) {
                        check = false;
                        return check;
                    }

                }
            } else {
                for (int i = 1; i < this.getCoordinatesY() - y; i++) {
                    int k = this.getCoordinatesY() - i;
                    if (board.getAt(x, k) != null) {
                        check = false;
                        return check;
                    }
                }
            }
        }
        if (y == this.getCoordinatesY()) {
            if (this.getCoordinatesX() <= x) {
                for (int i = 1; i < x - this.getCoordinatesX(); i++) {
                    int k = this.getCoordinatesX() + i;
                    if (board.getAt(k, y) != null) {
                        check = false;
                        return check;
                    }

                }
            } else {
                for (int i = 1; i < this.getCoordinatesX() - y; i++) {
                    int k = this.getCoordinatesX() - i;
                    if (board.getAt(k, y) != null) {
                        check = false;
                        return check;
                    }
                }
            }
        }
        return check;
    }
}
