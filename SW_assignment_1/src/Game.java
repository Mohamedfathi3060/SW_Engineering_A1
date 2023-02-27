public abstract class Game {
    protected Board board;
    protected  Player[] players;
    protected int turn;
    protected _2DIndex move;
    abstract void play_game();
}
