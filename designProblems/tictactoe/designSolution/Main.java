package designProblems.tictactoe.designSolution;

public class Main {

    public static void main(String[] args) {
        TicTacToeGame tictacToeGame = new TicTacToeGame();
        final String winner = tictacToeGame.startGame();
        System.out.println("Winner name is"+ winner);
    }
}
