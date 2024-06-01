package designProblems.tictactoe.designSolution;

import designProblems.tictactoe.designSolution.model.Cell;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class TicTacToeGame {

    Deque<Player> players;

    Board gameBoard;

    public TicTacToeGame(){
        initializeGame();
    }

    public void initializeGame(){
        players = new LinkedList<>();
        players.add(new Player("player_x", new PlayingPiece(PieceType.X)));
        players.add(new Player("player_o", new PlayingPiece(PieceType.O)));
        gameBoard = new Board(3);
    }

    public String startGame() {
        boolean isNoWinner = true;
        while(isNoWinner) {
            Player currentPlayer = players.removeFirst();
            List<Cell> freecells = gameBoard.getFreeCells();
            System.out.println(freecells.size());
            if(freecells.isEmpty()){
                isNoWinner = false;
                continue;
            } else {
                Cell freeCell = freecells.get(0);
                Cell chosenCell;
                System.out.println("Player"+ currentPlayer.getName()+  "turn" +"enter row column");
                do { 
                    Scanner inputScanner = new Scanner(System.in);
                    String s = inputScanner.nextLine();
                    String[] values = s.split(",");
                    int row = Integer.valueOf(values[0]);
                    int column = Integer.valueOf(values[1]);
                    System.out.println("row is"+ row);
                    System.out.println("column is"+ column);
                    chosenCell = new Cell(column, row);

                } while (!chosenCellFree(chosenCell, freecells));
                System.out.println("exit from input loop");
                gameBoard.addPiece(chosenCell.getRow(), chosenCell.getColumn(), currentPlayer.getPiece());

                players.addLast(currentPlayer);
                if(isThereWinner(chosenCell, currentPlayer.getPiece().pieceType, gameBoard.board))
                return currentPlayer.getName();
            }
        }
        return "MatchDraw";
    }

    private boolean chosenCellFree(Cell chosenCell, List<Cell> freeCells) {
        for(Cell cell: freeCells) {
            if(cell.getRow() == chosenCell.getRow() && cell.getColumn() == chosenCell.getColumn()){
                return true;
            }
        }
        return false;
    }

    private boolean isThereWinner(final Cell chosenCell, final PieceType pieceType, final PlayingPiece[][] board) {
        PieceType pieceTypex = PieceType.X;
        PieceType pieceTypeo = PieceType.O;

        //rowMatch
        for(int i=0;i<board.length;i++){
            if(board[i][0]==null)
            continue;
            boolean rowFlag = true;
            for(int j=1;j<board.length;j++){
                if(board[i][j]==null){
                    rowFlag = false;
                    break;
                }
                if(board[i][j-1].getPieceType()!=board[i][j].getPieceType()){
                    rowFlag = false;
                    break;
                }
            }
            System.out.println("rowflag is"+ rowFlag);
            if(rowFlag == true)
            return true;
        }

        //columnMatch
        for(int j=0;j<board.length;j++){
            boolean columnFlag = true;
            if(board[0][j]==null)
            continue;
            for(int i=1;i<board.length;i++){
                if(board[i][j]==null){
                    columnFlag = false;
                    break;
                }
                if(board[i-1][j].getPieceType()!=board[i][j].getPieceType()){
                    columnFlag = false;
                    break;
                }
            }
            System.out.println("colflag is"+ columnFlag);
            if(columnFlag == true)
            return true;
        }

        //Right diagonalMatch
        for(int i=1,j=1;i<board.length;i++,j++){
            if(board[0][0]==null)
            break;
            if(board[i][j]==null)
            break;
            boolean diaFlag = true;
            if(board[i-1][j-1].getPieceType()!=board[i][j].getPieceType()){
                diaFlag = false;
                break;
            }
            System.out.println("diaflag is"+ diaFlag);
            if(diaFlag==true)
            return true;
        }

        //Left Diagonal Match

        for(int i=1,j=board.length-2;i<board.length;i++,j--){
            if(board[0][j+1]==null)
            break;
            if(i>=0&&j>=0&&board[i][j]==null)
            break;
            if(board[i][j]==null)
            break;
            if(board[i-1][j+1]==null)
            break;
            boolean diaFlag = true;
            if(board[i-1][j+1].getPieceType()!=board[i][j].getPieceType()){
                diaFlag = false;
                break;
            }
            System.out.println("diaflag is"+ diaFlag);
            if(diaFlag==true)
            return true;
        }
        return false;
    }

    private boolean samePieceType(PlayingPiece[] playingPieceRow, int size) {
        for(int i=1;i<size;i++){
            if(playingPieceRow[i]==null)
            return false;
            if(playingPieceRow[i].getPieceType()!=playingPieceRow[i-1].getPieceType()){
                return false;
            }
        }
        return true;
    }
}

