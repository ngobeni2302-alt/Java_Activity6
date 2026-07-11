package com.activity;

public class ForLoops {

    // Problem 1: Step-by-step compound fleet value reduction
    public double calculateDepreciation(double startingValue, double rate, int years) {
        double currentValue = startingValue;
        // TODO: Use a standard for-loop to apply compound depreciation over the given number of years
        return currentValue;
    }

    // Problem 2: Sum up elements inside an array containing passenger capacities
    public int totalFleetCapacity(int[] vehicleCapacities) {
        int sum = 0;
        // TODO: Use an enhanced for-loop (for-each) to sum all integer capacities in the array
        return sum;
    }

    // Problem 3: Generate a structural dash-separated timeline string
    public String generateIntervalTimeline(int startHour, int endHour, int step) {
        String result = "";
        // TODO: Build a timeline string (e.g., startHour=8, endHour=14, step=2 yields "8-10-12-14-")
        return result;
    }

    // Problem 4: Locate matching identification flags inside data sets
    public int countTargetVehicles(String[] inventory, String targetType) {
        int count = 0;
        // TODO: Loop through inventory array and count occurrences that exactly match targetType
        return count;
    }

    // Problem 5: Factorial tracker for logistics arrangements
    public long calculateRoutePermutations(int routeNodes) {
        long permutations = 1;
        // TODO: Compute the factorial of routeNodes (e.g., 5! = 5 * 4 * 3 * 2 * 1) using a loop
        return permutations;
    }
}
