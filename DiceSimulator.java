import java.util.Random;

public class DiceSimulator {
    public static void main(String[] args) {
        Random random = new Random();
        int diceRoll = random.nextInt(6) + 1;
        System.out.println("You rolled a " + diceRoll);
    }
}
