package designProblems.tictactoe.designSolution;

public enum PieceType {
    X("X"),
    O("O");

    private String value;

    PieceType(String string) {
        //TODO Auto-generated constructor stub
        this.value = string;
    }

    public String getValue() {
        return value;
    }
}
