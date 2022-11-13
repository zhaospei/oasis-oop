import java.util.ArrayList;

public class Board {
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;
    private ArrayList<Piece> pieces;

    public Board() {
        pieces = new ArrayList<Piece>();
    }

    /**
     * Comment.
     */
    public void addPiece(Piece piece) {
        for (int i = 0; i < pieces.size(); i++) {
            if (piece.getCoordinatesX() == pieces.get(i).getCoordinatesX()
                    && piece.getCoordinatesY() == pieces.get(i).getCoordinatesY()) {
                return;
            }
        }
        pieces.add(piece);
    }

    public boolean validate(int x, int y) {
        return 1 <= x && 1 <= y && x <= 8 && y <= 8;
    }

    /**
     * Comment.
     */
    public void removeAt(int x, int y) {
        for (int i = 0; i < pieces.size(); i++) {
            if (x == pieces.get(i).getCoordinatesX()
                    && y == pieces.get(i).getCoordinatesY()) {
                pieces.remove(pieces.get(i));
                break;
            }
        }
    }

    /**
     * Comment.
     */
    public Piece getAt(int x, int y) {
        for (int i = 0; i < pieces.size(); i++) {
            if (x == pieces.get(i).getCoordinatesX()
                    && y == pieces.get(i).getCoordinatesY()) {
                return pieces.get(i);
            }
        }
        return null;
    }

    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }
}
 