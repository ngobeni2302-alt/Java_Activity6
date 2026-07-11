package com.activity;

public class WhileLoops {

    // Problem 1: Step down fuel resource metrics dynamically
    public int simulateDriveDistance(int totalFuel, int consumptionPerStint) {
        int distanceTraveled = 0;
        // TODO: While totalFuel >= consumptionPerStint, increment distance by 100 and subtract consumption from fuel
        return distanceTraveled;
    }

    // Problem 2: Track target milestones for compounding accounts
    public int trackingYearsToProfitTarget(double initialCapital, double targetProfit, double annualYield) {
        int years = 0;
        double currentBalance = initialCapital;
        // TODO: While currentBalance is less than targetProfit, add interest (currentBalance * annualYield) and increment years
        return years;
    }

    // Problem 3: Algorithmic digit sum isolation
    public int sumOdometerDigits(int odometerValue) {
        int sum = 0;
        // TODO: Use a while loop with mathematical division (/) and modulo (%) operators to extract and sum every digit
        return sum;
    }

    // Problem 4: Safely drain tank parameters to empty states
    public int drainHydraulicFluid(int currentLevel, int drainageRate) {
        int remaining = currentLevel;
        // TODO: Use a while loop to subtract drainageRate from remaining until remaining is less than or equal to 0. Return final remaining value (never return negative, return 0 if it drops below).
        return remaining;
    }

    // Problem 5: Continuous linear search loop structural match
    public int findFirstAvailableBay(boolean[] garageBays) {
        int index = 0;
        // TODO: While index is within bounds and garageBays[index] is true (occupied), increment index. Return first index that is false (available). If none found, return -1.
        return -1;
    }
}
