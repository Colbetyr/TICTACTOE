package org.WalkerCC_CompSci;

public class Player {
    private Space space;
    private int playOrder;


    public Player(Space space, int playOrder) {
        this.space = space;
        this.playOrder = playOrder;
    }

    public Space getPiece(){
        return this.space;
    }
}
