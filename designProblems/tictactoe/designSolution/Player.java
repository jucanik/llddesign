package designProblems.tictactoe.designSolution;

public class Player {

    private String name;
    private PlayingPiece piece;

    public Player(final String name, final PlayingPiece piece) {
        this.name = name;
        this.piece = piece;
    }

    public String getName() {
        return name;
    }

    public PlayingPiece getPiece() {
        return piece;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPiece(PlayingPiece piece) {
        this.piece = piece;
    }

    
}
