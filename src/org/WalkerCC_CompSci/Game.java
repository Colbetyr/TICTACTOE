package org.WalkerCC_CompSci;

import java.util.Scanner;

public class Game {
    private GameBoard gameBoard;
    private Player playerA;
    private Player playerB;
    private boolean isComplete = false;

    public Game(){
        gameBoard = new GameBoard();
        playerA = new Player(Space.X, 1);
        playerB = new Player(Space.O, 2);
    }


    public void Play() {
        //Clean this up so that it handles repetition and ends the game when its over.

        Scanner myScan = new Scanner(System.in);
        gameBoard.Draw();

        while(true) {

            System.out.println("Player A:  Enter a location number.");
            int location = myScan.nextInt();

            gameBoard.PlaceOnBoard(playerA.getPiece(), location);
            boolean ifWon = CheckForWin();

            if (ifWon) {
                System.out.println("Player A Wins");
                gameBoard.Draw();
                return;
            }

            if (IsFilled()) {
                System.out.println("Draw:  All Spaces Filled");
                gameBoard.Draw();
                return;
            }

            gameBoard.Draw();

            System.out.println("Player B:  Enter a location number.");
            location = myScan.nextInt();

            gameBoard.PlaceOnBoard(playerB.getPiece(), location);
            ifWon = CheckForWin();

            if (ifWon) {
                System.out.println("Player B Wins");
                gameBoard.Draw();
                return;
            }

            if (IsFilled()) {
                System.out.println("Draw:  All Spaces Filled");
                gameBoard.Draw();
                return;
            }

            gameBoard.Draw();
        }

    }

    private boolean CheckForWin() {

        if(this.gameBoard.spaces[0] == this.gameBoard.spaces[1] && this.gameBoard.spaces[1] == this.gameBoard.spaces[2]){
            if (this.gameBoard.spaces[0] != Space.EMPTY){
                return true;
            }
        } else if (this.gameBoard.spaces[3] == this.gameBoard.spaces[4] && this.gameBoard.spaces[4] == this.gameBoard.spaces[5]) {
            if (this.gameBoard.spaces[3] != Space.EMPTY) {
                return true;
            }
        } else if (this.gameBoard.spaces[6] == this.gameBoard.spaces[7] && this.gameBoard.spaces[7] == this.gameBoard.spaces[8]) {
            if (this.gameBoard.spaces[6] != Space.EMPTY) {
                    return true;
            }
        } else if (this.gameBoard.spaces[0] == this.gameBoard.spaces[3] && this.gameBoard.spaces[3] == this.gameBoard.spaces[6]) {
            if (this.gameBoard.spaces[0] != Space.EMPTY) {
                return true;
            }
        } else if (this.gameBoard.spaces[1] == this.gameBoard.spaces[4] && this.gameBoard.spaces[4] == this.gameBoard.spaces[7]) {
            if (this.gameBoard.spaces[1] != Space.EMPTY) {
                return true;
            }
        } else if (this.gameBoard.spaces[2] == this.gameBoard.spaces[5] && this.gameBoard.spaces[5] == this.gameBoard.spaces[8]) {
            if (this.gameBoard.spaces[2] != Space.EMPTY) {
                return true;
            }
        } else if (this.gameBoard.spaces[0] == this.gameBoard.spaces[4] && this.gameBoard.spaces[4] == this.gameBoard.spaces[8]) {
            if (this.gameBoard.spaces[0] != Space.EMPTY) {
                return true;
            }
        } else if (this.gameBoard.spaces[2] == this.gameBoard.spaces[4] && this.gameBoard.spaces[4] == this.gameBoard.spaces[6]) {
            if (this.gameBoard.spaces[2] != Space.EMPTY) {
                return true;
            }
        }

        return false;

    }

    private boolean IsFilled(){

        for(int i = 0; i < gameBoard.spaces.length; i++){

            if((this.gameBoard.spaces[0] != Space.EMPTY) &&
                    (this.gameBoard.spaces[1] != Space.EMPTY) &&
                    (this.gameBoard.spaces[2] != Space.EMPTY) &&
                    (this.gameBoard.spaces[3] != Space.EMPTY) &&
                    (this.gameBoard.spaces[4] != Space.EMPTY) &&
                    (this.gameBoard.spaces[5] != Space.EMPTY) &&
                    (this.gameBoard.spaces[6] != Space.EMPTY) &&
                    (this.gameBoard.spaces[7] != Space.EMPTY) &&
                    (this.gameBoard.spaces[8] != Space.EMPTY)){
                return true;
            }

        }

        return false;
    }

}
