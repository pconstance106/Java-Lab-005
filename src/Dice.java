import java.util.Random;

public class Dice {
    private int sideFacingUp;
    private int sides;
    private Random randomGenerator;

    public void roll() {
        sideFacingUp = randomGenerator.nextInt(1, sides);
    }

    public int view() {
        return sideFacingUp;
    }

    public Dice(int numberOfSides) {
        sides = numberOfSides;
        randomGenerator = new Random();
    }
}