import java.util.ArrayList;

public class Game {
    private final ArrayList<Move> moveHistory = new ArrayList<>();
    private Board board;

    public Game(Board board) {
        this.board = board;
    }

    /**
     * Comment.
     */
    public void movePiece(Piece piece, int x, int y) {
        if (piece.canMove(board, x, y)) {
            if (board.getAt(x, y) != null
                    && !(board.getAt(x, y).getColor().equals(piece.getColor()))) {
                moveHistory.add(new Move(piece.getCoordinatesX(), 
                    piece.getCoordinatesY(), x, y, piece, board.getAt(x, y)));
                board.removeAt(x, y);
                piece.setCoordinatesX(x);
                piece.setCoordinatesY(y);
            }
            if (board.getAt(x, y) == null) {
                moveHistory.add(new Move(piece.getCoordinatesX(), 
                    piece.getCoordinatesY(), x, y, piece));
                piece.setCoordinatesX(x);
                piece.setCoordinatesY(y);
            }

        }
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public ArrayList<Move> getMoveHistory() {
        return moveHistory;
    }
}
 