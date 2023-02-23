import java.util.Scanner;
public class XO_Game extends Game {
    Scanner input = new Scanner(System.in);
    XO_Game()
    {
        board = new XO_Board();
        players = new XO_Player[2];
        move = new _2DIndex();
        turn = 0;
    }
    void play_game()
    {
        System.out.println("Hello in XO_GAME");
        System.out.println("enter your name player1: ");
        String name1 = input.nextLine();
        System.out.println("enter your name player2: ");
        String name2 = input.nextLine();
        players[0] = new XO_Player(name1,'X');

        players[1] = new XO_Player(name2,'O');


        while (true)
        {

            board.display_board();
            do {
                players[turn].get_move(move);
            }
            while (!board.update_board(move.x, move.y, players[turn].symbol));
            board.n_moves++;

            if (board.is_winner(players[turn].get_symbol()))
            {
                board.display_board();
                System.out.println("Game over. " + players[turn].get_name() + " Win!");
                break;
            }
            else if(board.is_draw())
            {
                board.display_board();
                System.out.println("Game over. Draw ");
                break;
            }
            if(turn == 0){
                turn = 1;
            }
            else
            {
                turn = 0;
            }
            }
        }


}



