//Darts class in MASTER
//Darts class in branch INITIAL

public class Darts {
    enum Multiplier {
        DOUBLE, TRIPLE, XX;
    }
    private int score = 301;
    private int dartsLeft = 3;
    private boolean isFinished = false;
    private int turn = 1;
    private int lastTurnScore = score;

    public int score() {
        return score;
    }

    public int dartsLeft() {
        return dartsLeft;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public int turn() {
        return turn;
    }

    public void darts(int scoreTemp) {
        updateDartBoard(scoreTemp, null);
    }


}
