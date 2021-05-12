package com.designPatterns.Behavioural.observerPattern.geeksforgeeks;

// Driver clas
public class CricketApp_WithOutPattern {
    public static void main(String args[]) {
        // Create objects for testing
        AverageScoreDisplay_WithOutPattern averageScoreDisplay = new AverageScoreDisplay_WithOutPattern();
        CurrentScoreDisplay_WithOutPattern currentScoreDisplay = new CurrentScoreDisplay_WithOutPattern();

        // Pass the displays to Cricket data
        CricketData_WithOutPattern cricketData = new CricketData_WithOutPattern(currentScoreDisplay,averageScoreDisplay);

        // In real app you would have some logic to call this
        // function when data changes
        cricketData.dataChanged();
    }

}
