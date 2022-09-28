import java.util.Scanner;

/**
 * @author Trevor Hartman
 * @author Paul Constance
 * @since Version 1.0
 *
 */

public class Game {
    Player p1;
    Player p2;
    Dice die;
    public void play() {
        Player current = this.p1;
        takeTurn(current);
        current = nextPlayer(current);
        takeTurn(current);
        announceWinner();
    }
    public Player nextPlayer(Player current) {
        if (current == this.p1) {
            return this.p2;
        } else {
            return this.p1;
        }
    }
    public void takeTurn(Player player) {
        player.toss(this.die);
    }
    public int announceWinner() {
        int p1Score = p1.getScore();
        int p2Score = p2.getScore();

        System.out.println("Player " + p1.getName() + " rolled: " + p1.getScore());
        System.out.println("Player " + p2.getName() + " rolled: " + p2.getScore());

        if (p1Score > p2Score) {
            System.out.println("The Winner is " + p1.getName() + "!");
        } else if (p1Score < p2Score) {
            System.out.println("The Winner is " + p2.getName() + "!");
        }
        return 69; //lol
    }
    public Game(Player one, Player two, Dice diceSides) {
        p1 = one;
        p2 = two;
        die = diceSides;
    }
    public static void main(String[] args) {
        String p1Name;
        String p2Name;

        Scanner input = new Scanner(System.in);

        System.out.println("Player 1 Name");
        p1Name = input.nextLine();

        System.out.println("Player 2 Name");
        p2Name = input.nextLine();

        System.out.println("# of dice sides");
        int sides = input.nextInt();

        Game start = new Game(new Player(p1Name), new Player(p2Name), new Dice(sides));
        start.play();
    }
}