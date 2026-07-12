package com.activity;

public class Conditionals {
    
    // Problem 1: Check if a vehicle needs an inspection based on days since last service
    public boolean checkMaintenanceUrgency(int daysSinceLastService) {
        // TODO: Return true if daysSinceLastService is greater than 30, false otherwise
        if (daysSinceLastService > 30){
            return true;
        }
        return false;
    }

    // Problem 2: Find standard daily base rental rates using a modern switch expression
    public double getRentalRate(String vehicleType) {
        // TODO: "Car" -> 40.0, "SUV" -> 60.0, "Truck" -> 80.0, any other string -> 30.0
        if (vehicleType == "Car"){
            return 40.0;
        } else if (vehicleType == "SUV") {
            return 60.0;
        } else if (vehicleType == "Truck") {
            return 80.0;
        } else {
            return 30.0;
        }
    }

    // Problem 3: Apply risk discount based on safe driving years
    public double calculateInsuranceDiscount(int safeYears, boolean hasAccidentHistory) {
        // TODO: If hasAccidentHistory is true, discount is 0.0. 
        // Otherwise: safeYears >= 5 -> 0.20 (20%), safeYears >= 2 -> 0.10 (10%), else 0.0
        if (safeYears >= 5 && hasAccidentHistory == false){
            return 0.20;
        } else if (safeYears >= 2 && hasAccidentHistory == false) {
            return 0.10;
        } else {
            return 0.0;
        }

    }

    // Problem 4: Validate if cargo weight passes structural rules
    public String verifyCargoWeight(int weightLbs) {
        // TODO: weightLbs <= 0 -> "Invalid", weightLbs <= 2000 -> "Light", weightLbs <= 5000 -> "Medium", else "Overweight"
        if (weightLbs <= 0){
            return "Invalid";
        } else if (weightLbs <= 2000) {
            return "Light";
        } else if (weightLbs <= 5000){
            return "Medium";
        } else {
            return "Overweight";
        }
    }

    // Problem 5: Determine dispatch approval based on cross-parameter checks
    public boolean approveDispatch(boolean driverRested, boolean vehicleChecked, boolean weatherSevere) {
        // TODO: Approve dispatch (return true) ONLY if driverRested AND vehicleChecked are true, AND weatherSevere is false
        if (driverRested == true && vehicleChecked == true && weatherSevere == false){
            return true;
        } else {
            return false;
        }
    }
}
