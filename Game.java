public abstract class Game {
    protected XO_Board board;
    protected  XO_Player[] players;
    protected int turn;
    protected _2DIndex move;
    abstract void play_game();
}
