import java.awt.*;
import java.util.Scanner;
public class XO_Player extends Player{
    Scanner input = new Scanner(System.in);
    XO_Player(String name, char symbol) {
        super(name, symbol);
        this.name = name;
        this.symbol = symbol;
    }

    @Override
    void get_move(_2DIndex P) {
        System.out.println("\nPlease enter your move x and y(0 to 2) separated with space  : ");
        int x = input.nextInt();
        int y = input.nextInt();
        P.set_Index(x,y);
    }

    @Override
    char get_symbol() {
        return symbol;
    }

    @Override
    String get_name() {
        return this.name;
    }
}
