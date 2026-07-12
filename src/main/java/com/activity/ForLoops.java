package com.activity;

public class ForLoops {

    // Problem 1: Step-by-step compound fleet value reduction
    public double calculateDepreciation(double startingValue, double rate, int years) {
        double currentValue = startingValue;
        for (int year = 1; year <= years; year++) {
            currentValue = currentValue - (currentValue * rate);
        }
        return currentValue;
    }

    // Problem 2: Sum up elements inside an array containing passenger capacities
    public int totalFleetCapacity(int[] vehicleCapacities) {
        int sum = 0;
        // TODO: Use an enhanced for-loop (for-each) to sum all integer capacities in the array
        for (int cap : vehicleCapacities){
            sum = sum + cap;
        }
        return sum;
    }

    // Problem 3: Generate a structural dash-separated timeline string
    public String generateIntervalTimeline(int startHour, int endHour, int step) {
        String result = "";
        for (int i = startHour; i <= endHour; i += step) {
            result = result + i + "-";
        }
        return result;
    }

    // Problem 4: Locate matching identification flags inside data sets
    public int countTargetVehicles(String[] inventory, String targetType) {
        int count = 0;
        // TODO: Loop through inventory array and count occurrences that exactly match targetType
        for (String invent : inventory){
            if (invent.equals(targetType)){
                count++;
            }
        }
        return count;
    }

    // Problem 5: Factorial tracker for logistics arrangements
    public long calculateRoutePermutations(int routeNodes) {
        long permutations = 1;
        for (int i = routeNodes; i >= 1; i--) {
            permutations = permutations * i;
        }
        return permutations;
    }
}
