package io.github.imecuadorian.sport_competition;

public record Athlete(int score) {

    @Override
    public String toString() {
        return "Athlete{" +
                "score=" + score +
                '}';
    }
}
