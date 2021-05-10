package com.designPatterns.Behavioural.observerPattern.geeksforgeeks;

public class CricketData_WithOutPattern {
    int runs, wickets;
    float overs;

    CurrentScoreDisplay_WithOutPattern currentScoreDisplay;
    AverageScoreDisplay_WithOutPattern averageScoreDisplay;

    // Constructor
    public CricketData_WithOutPattern(CurrentScoreDisplay_WithOutPattern currentScoreDisplay,AverageScoreDisplay_WithOutPattern averageScoreDisplay) {
        this.currentScoreDisplay = currentScoreDisplay;
        this.averageScoreDisplay = averageScoreDisplay;
    }

    // Get latest runs from stadium
    private int getLatestRuns() {
        // return 90 for simplicity
        return 90;
    }

    // Get latest wickets from stadium
    private int getLatestWickets() {
        // return 2 for simplicity
        return 2;
    }

    // Get latest overs from stadium
    private float getLatestOvers() {
        // return 10.2 for simplicity
        return (float) 10.2;
    }

    // This method is used update displays when data changes
    public void dataChanged() {
        // get latest data
        runs = getLatestRuns();
        wickets = getLatestWickets();
        overs = getLatestOvers();

        currentScoreDisplay.update(runs, wickets, overs);
        averageScoreDisplay.update(runs, wickets, overs);
    }
}

// A class to display average score. Data of this class is
// updated by CricketData
class AverageScoreDisplay_WithOutPattern {
    private float runRate;
    private int predictedScore;

    public void update(int runs, int wickets, float overs) {
        this.runRate = (float) runs / overs;
        this.predictedScore = (int) (this.runRate * 50);
        display();
    }

    public void display() {
        System.out.println("\nAverage Score Display:\n" +
                "Run Rate: " + runRate +
                "\nPredictedScore: " + predictedScore);
    }
}

// A class to display score. Data of this class is
// updated by CricketData
class CurrentScoreDisplay_WithOutPattern {
    private int runs, wickets;
    private float overs;

    public void update(int runs, int wickets, float overs) {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
        display();
    }

    public void display() {
        System.out.println("\nCurrent Score Display: \n" +  "Runs: " + runs + "\nWickets:"+ wickets + "\nOvers: " + overs);
    }
}

