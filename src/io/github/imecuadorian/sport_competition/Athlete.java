package io.github.imecuadorian.sport_competition;

public class Athlete {

    private int score;

    public Athlete(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "score=" + score +
                '}';
    }
}
