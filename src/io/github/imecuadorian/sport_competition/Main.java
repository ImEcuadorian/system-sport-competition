package io.github.imecuadorian.sport_competition;

import java.util.*;

import static io.github.imecuadorian.sport_competition.Quantifier.*;

public class Main {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final List<Athlete> ATHLETES = new ArrayList<>(10);
    private static int excellentAthletes = 0;
    private static int goodAthletes = 0;
    private static int regularAthletes = 0;
    private static int insufficientAthletes = 0;

    public static void main(String[] args) {

        while (ATHLETES.size() < 10) {
            addAthlete();
        }
        evaluateAthletes();
        printResults();
    }

    private static void addAthlete() {
        System.out.println("Enter the athlete's score:");
        do {
            int score = SCANNER.nextInt();
            if (validateScore(score)) {
                ATHLETES.add(new Athlete(score));
                break;
            } else {
                System.out.println("Invalid score. Please enter a score between 0 and 100.");
            }
        } while (true);

    }

    private static void evaluateAthletes() {
        for (Athlete athlete : ATHLETES) {
            int score = athlete.getScore();
            if (score >= EXCELLENT.getMinScore() && score <= EXCELLENT.getMaxScore()) {
                excellentAthletes++;
            } else if (score >= GOOD.getMinScore() && score <= GOOD.getMaxScore()) {
                goodAthletes++;
            } else if (score >= REGULAR.getMinScore() && score <= REGULAR.getMaxScore()) {
                regularAthletes++;
            } else {
                insufficientAthletes++;
            }
        }
    }

    private static void printResults() {
        String message = """
                
                Information about the athletes:
                
                Excellent athletes: %d
                Good athletes: %d
                Regular athletes: %d
                Insufficient athletes: %d
                
                """.formatted(excellentAthletes, goodAthletes, regularAthletes, insufficientAthletes);
        System.out.println(message);
    }

    private static boolean validateScore(int score) {
        return score >= 0 && score <= 100;
    }

}
