package designProblems.tictactoe.designSolution;

import designProblems.tictactoe.designSolution.model.Cell;
import java.util.ArrayList;
import java.util.List;

public class Board {

    public int size;
    public PlayingPiece[][] board;

    public Board(int size){
        this.size = size;
        this.board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int r, int c, PlayingPiece piece) {
        if(board[r][c]!=null){
            return false;
        }
        board[r][c]=piece;
        return true;
    }

    public List<Cell> getFreeCells() {
        List<Cell> cells = new ArrayList<>();
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(board[i][j]==null){
                    Cell cell = new Cell(j,i);
                    cells.add(cell);
                }
            }
        }
        return cells;
    }
}
