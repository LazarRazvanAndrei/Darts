//Darts class in MASTER

public class Darts {
    enum Multiplier {
        DOUBLE, TRIPLE, XX;
    }
    private int score = 301;
    private int dartsLeft = 3;
    private boolean isFinished = false;
    private int turn = 1;
    private int lastTurnScore = score;
}
