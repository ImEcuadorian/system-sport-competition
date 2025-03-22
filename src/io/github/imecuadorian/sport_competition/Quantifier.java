package io.github.imecuadorian.sport_competition;

public enum Quantifier {

    EXCELLENT(90, 100),
    GOOD(75, 89),
    REGULAR(50, 74),
    INSUFFICIENT(0, 49);

    private final int minScore;

    private final int maxScore;

    Quantifier(int minScore, int maxScore) {
        this.minScore = minScore;
        this.maxScore = maxScore;
    }

    public int getMinScore() {
        return minScore;
    }

    public int getMaxScore() {
        return maxScore;
    }
}
