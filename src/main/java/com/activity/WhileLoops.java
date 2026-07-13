package com.activity;

public class WhileLoops {

    // Problem 1: Step down fuel resource metrics dynamically
    public int simulateDriveDistance(int totalFuel, int consumptionPerStint) {
        int distanceTraveled = 0;
        while (totalFuel >= consumptionPerStint) {
            distanceTraveled = distanceTraveled + 100;
            totalFuel = totalFuel - consumptionPerStint; // Fixed: Deduct fuel to prevent infinite loops
        }
        return distanceTraveled;
    }

    // Problem 2: Track target milestones for compounding accounts
    public int trackingYearsToProfitTarget(double initialCapital, double targetProfit, double annualYield) {
        int years = 0;
        double currentBalance = initialCapital;
        while (currentBalance < targetProfit) {
            currentBalance = currentBalance + (currentBalance * annualYield);
            years++;
        }
        return years;
    }

    // Problem 3: Algorithmic digit sum isolation
    public int sumOdometerDigits(int odometerValue) {
        int sum = 0;
        while (odometerValue > 0) {
            sum = sum + (odometerValue % 10);   // Extract the last digit
            odometerValue = odometerValue / 10; // Discard the last digit
        }
        return sum;
    }

    // Problem 4: Safely drain tank parameters to empty states
    public int drainHydraulicFluid(int currentLevel, int drainageRate) {
        int remaining = currentLevel;
        while (remaining > 0) {
            remaining = remaining - drainageRate;
        }
        if (remaining < 0) {
            remaining = 0; // Normalize negative numbers down to 0
        }
        return remaining;
    }

    // Problem 5: Continuous linear search loop structural match
    public int findFirstAvailableBay(boolean[] garageBays) {
        int index = 0;
        // Stay inside array limits AND keep skipping while the bay is occupied (true)
        while (index < garageBays.length && garageBays[index]) {
            index++;
        }
        // If index reached the end, no bay was open
        if (index >= garageBays.length) {
            return -1;
        }
        return index;
    }
}