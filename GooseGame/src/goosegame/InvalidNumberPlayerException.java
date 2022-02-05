package goosegame;

public class InvalidNumberPlayerException extends Exception{
  /**
    * Constructor for InvalidNumberPlayerException
    * Used if there are no players on a game of goosegame.
    * @param message The explicit message when this error occurs.
    */
  public InvalidNumberPlayerException(String message){
    super(message);
  }
}
