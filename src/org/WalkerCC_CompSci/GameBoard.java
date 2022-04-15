package org.WalkerCC_CompSci;

public class GameBoard {

    // 0 | 1 | 2
    //--- --- ---
    // 3 | 4 | 5
    //--- --- ---
    // 6 | 7 | 8

    Space spaces[];
    String spacesText[];

    public GameBoard(){
        spaces = new Space[9];


        for(int i = 0; i < spaces.length; i++){
            spaces[i] = Space.EMPTY;
        }

        spacesText = new String[9];

        for(int i = 0; i < spacesText.length; i++){
            spacesText[i] = String.valueOf(i);
        }



    }

    public void PlaceOnBoard(Space pieceToPlace, int locationToPlace){
        if(spaces[locationToPlace] == Space.EMPTY){
            spaces[locationToPlace] = pieceToPlace;
            if(pieceToPlace == Space.X){
                spacesText[locationToPlace] = "X";
            }
            else{
                spacesText[locationToPlace] = "O";
            }

        }
    }

    public void Draw(){
         System.out.println("");
        System.out.println(" " + spacesText[0] + " | " + spacesText[1] + " | " + spacesText[2]);
        System.out.println("--- --- ---");
        System.out.println(" " + spacesText[3] + " | " + spacesText[4] + " | " + spacesText[5]);
        System.out.println("--- --- ---");
        System.out.println(" " + spacesText[6] + " | " + spacesText[7] + " | " + spacesText[8]);
        System.out.println("");
    }
}



//        System.out.println("");
//                System.out.println(" 0 | 1 | 2");
//                System.out.println("--- --- ---");
//                System.out.println(" 3 | 4 | 5");
//                System.out.println("--- --- ---");
//                System.out.println(" 6 | 7 | 8");
//                System.out.println("");
