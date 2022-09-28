public class Player {
    public Player(String playerName) {
        name = playerName;
    }
    private String name;

    private int score;

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public int toss(Dice sides) {
        sides.roll();
        score = sides.view();
        return score;
    }
}

