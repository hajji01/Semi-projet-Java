package goosegame.boards;
import goosegame.Board;
import goosegame.cells.*;


public class OnlyBasicBoard extends Board{

  /**
    * Constructor for OnlyBasicBoard.
    * Creates a board which have only basic cells.
    * @param nbCells Number of Cells on the board.
    */
  public OnlyBasicBoard(int nbCells){
    super(nbCells);
  }

  /**
    * Initializes the Board of a goose game.
    * Side effect : Affect cells to the board.
    */
  protected void initBoard(){
    for (int i=0; i<this.theCells.length; i++){
          this.theCells[i] = new BasicCell(i);
    }
  }

}
