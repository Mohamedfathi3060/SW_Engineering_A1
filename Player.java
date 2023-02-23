public abstract class Player {
    protected String name;
    protected char symbol;
    Player (String name, char symbol){};
    abstract void get_move(_2DIndex P);
    // Get symbol used by player
    abstract char get_symbol();
    // Get name of player
    abstract String get_name();
};
