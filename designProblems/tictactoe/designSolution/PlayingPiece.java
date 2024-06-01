package designProblems.tictactoe.designSolution;

public class PlayingPiece {
    public PieceType pieceType;

    public PlayingPiece(final PieceType pieceType) {
        this.pieceType = pieceType;
    }

    public PieceType getPieceType() {
        return pieceType;
    }

    public void setPieceType(PieceType pieceType) {
        this.pieceType = pieceType;
    }
}
