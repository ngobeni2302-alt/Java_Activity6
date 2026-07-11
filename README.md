Here is your complete, detailed, beginner-friendly `README.md` file combining the core concepts with all 15 assignments explained with deep clarity.

You can run the terminal command below to completely overwrite your project's README file with this comprehensive version!

bash
# Activity 6: Complete Control Flow Exercises

Welcome to Activity 6! This project is designed to help you practice how a program makes decisions and repeats tasks in Java. You will be working with **Conditionals**, **For Loops**, **Enhanced For Loops**, and **While Loops**.

Your mission is to open the three Java files inside this project, read the problems, and write the missing code inside each skeleton method. You will know you got it right when all 15 tests pass!


## 1. The Core Concepts Explained Simply

### 🚦 Conditionals (`if`, `else`, `switch`)
Think of conditionals like a **"Choose Your Own Adventure"** book or a road split. They let your program look at data, ask a true/false question, and change directions based on the answer.

#### The `if-else` Flow
The program checks conditions sequentially from top to bottom. The moment it hits a condition that is **true**, it runs that specific block of code and completely skips the entire remaining structure.
*   **`if`:** Your starting question. If true, do this.
*   **`else if`:** Your backup questions. If the first thing wasn't true, try checking this. You can chain as many of these as you need.
*   **`else`:** Your safety net. If *none* of the above questions were true, do this by default.

*Real-World Example:*
> **If** it is raining, grab an umbrella.
> **Else if** it is freezing, grab a heavy coat.
> **Else** (it's clear and warm), just wear a t-shirt.

java
int speed = 75;

if (speed > 80) {
    System.out.println("Issue a speeding ticket!"); // Runs if speed is 81+
} else if (speed > 60) {
    System.out.println("Give a warning adjustment."); // Runs if speed is 61 to 80
} else {
    System.out.println("Safe driving velocity.");    // Runs if speed is 60 or below
}

#### Modern Switch Expressions

A `switch` matches a **single variable** against multiple exact options (like a list of keys looking for a specific lock). Modern Java uses the arrow syntax (`->`), which makes switches clean, eliminates the old requirement for manual `break;` statements, and allows you to assign the result directly to a variable.

java
String fuelType = "Electric";

// The entire switch determines a value and drops it directly into the taxRate variable
double taxRate = switch (fuelType) {
    case "Diesel"   -> 0.25;
    case "Petrol"   -> 0.20;
    case "Electric" -> 0.05;
    default         -> 0.15; // Safeguard for unknown fuel types
};


### 🔁 Standard For Loops

Use a standard `for` loop when you know **exactly how many times** you need to repeat an action before the loop even starts.

It tracks execution using a built-in loop counter variable (usually named `i` for index). A standard `for` loop requires three distinct structural instructions separated by semicolons:

$$\text{for ( 1. Start Counter ; \,\, 2. Stop Condition ; \,\, 3. Update Step )}$$

1. **Start Counter:** Sets your starting point (e.g., `int i = 0`).
2. **Stop Condition:** A true/false check run before every round. If true, run the loop body. If false, stop immediately.
3. **Update Step:** The math calculation applied to your counter at the very end of *every* loop round (e.g., incrementing by 1 using `i++`).

*Real-World Example:* A fitness coach telling an athlete: *"Do exactly 10 pushups. Start counting at 1, stop when you finish round 10, and count upward by 1 every time."*

Look at the flexibility this counter gives you:

* **Counting Forward Normal:** `for (int i = 1; i <= 5; i++)` $\rightarrow$ Counts: 1, 2, 3, 4, 5.
* **Counting Backward:** `for (int i = 5; i >= 1; i--)` $\rightarrow$ Counts: 5, 4, 3, 2, 1.
* **Skipping Numbers (Intervals):** `for (int i = 0; i <= 10; i += 2)` $\rightarrow$ Counts even numbers: 0, 2, 4, 6, 8, 10.

java
int totalYears = 3;
double baselineValue = 1000.0;

for (int year = 1; year <= totalYears; year++) {
baselineValue += 200.0; // Add $200 of value every single year
        System.out.println("Year " + year + " valuation: $" + baselineValue);
}




### 🚙 Enhanced For Loops (For-Each)

This is a streamlined shortcut version of the `for` loop. Java provides this syntax specifically to make reading through sequences like arrays or collections clean and fast.

Instead of micro-managing counter offsets (`i = 0`, `i < array.length`, `i++`), you pass the array directly. The loop handles the tracking math internally under the hood. It says: *"Extract the next element from the sequence, assign it to a temporary variable name, run the code block, and move forward automatically."*

* **When to use:** Use this when you want to read every item from start to finish sequentially, and you don’t care about changing indices, skipping spots, or modifying the collection structure.

*Real-World Example:* Imagine a deck of cargo manifests sitting on a desk.

* **Standard For Loop:** *"Go to index card folder position 0, read it. Go to index folder position 1, read it..."*
* **Enhanced For Loop:** *"Pick up the deck. For each single paper card inside this stack, scan the text."*

java
// An array containing specific maintenance bay ID codes
int[] activeBays = {101, 104, 208, 312};

// Format: for (DataType temporaryName : targetArray)
for (int bayNumber : activeBays) {
        System.out.println("Dispatching cleaning team to repair bay: #" + bayNumber);
}





### 🔄 While Loops

Use a `while` loop when you need to repeat a task, but you **cannot predict ahead of time** how many rounds it will take to complete.

It acts exactly like a green traffic light: *"As long as this condition remains true, keep executing the code inside."* The system re-evaluates the true/false statement at the beginning of every single loop iteration. The moment that expression flips to `false`, the system hits the brakes, jumps out of the loop structure, and continues down the remaining code lines.

#### ⚠️ The Infinite Loop Warning

Because `while` loops don't have built-in index counter step limits, **you** must write code inside the loop block that eventually forces the conditional statement to become false. If you forget to update variables inside the loop body, your program will get stuck repeating the action forever, leading to an application freeze or crash.

*Real-World Example:* Driving a car down a long highway at night: *"As long as the low fuel warning dashboard indicator light is NOT glowing, keep driving down the highway forward."* You don't know the exact count of seconds or miles ahead of time, but you know the event rule that will make you pull over.

java
int cargoWeightOnTruck = 8000; // lbs
int craneUnloadCapacity = 2500; // How much weight the crane removes per lift round
int unloadRounds = 0;

// The loop keeps running until the weight drops below 2500 lbs
while (cargoWeightOnTruck >= craneUnloadCapacity) {
cargoWeightOnTruck -= craneUnloadCapacity; // Modify the condition variables!
unloadRounds++;
        System.out.println("Round " + unloadRounds + ": Removed cargo. Weight left: " + cargoWeightOnTruck + " lbs");
}


## 2. Your Assignment: The 15 Problems to Solve

### 📁 `Conditionals.java` (Making Decisions)

1. **`checkMaintenanceUrgency`**
* **Goal:** Look at an incoming number of days since last service.
* **Logic:** Return `true` if the vehicle hasn't been serviced in strictly *more than* 30 days. Otherwise, return `false`.
* *Example:* 45 days $\rightarrow$ `true`, 30 days $\rightarrow$ `false`.


2. **`getRentalRate`**
* **Goal:** Look at an incoming vehicle type text string and return its daily rate.
* **Logic:** Use a switch expression to match prices: `"Car"` costs `40.0`, `"SUV"` costs `60.0`, and `"Truck"` costs `80.0`. Anything else defaults to `30.0`.


3. **`calculateInsuranceDiscount`**
* **Goal:** Determine an insurance discount multiplier based on safe driver parameters.
* **Logic:** If the driver has an accident history (`hasAccidentHistory` is true), they instantly get `0.0`. If they have a clean record, give them a `0.20` (20%) discount for 5+ years of safe driving, a `0.10` (10%) discount for 2+ years, and `0.0` for anything less.


4. **`verifyCargoWeight`**
* **Goal:** Group structural cargo weights into text descriptive categories.
* **Logic:** If the weight is 0 or less, return `"Invalid"`. Up to 2000 lbs is `"Light"`, up to 5000 lbs is `"Medium"`, and anything heavier is `"Overweight"`.


5. **`approveDispatch`**
* **Goal:** Decide whether a transport truck is authorized to leave the garage.
* **Logic:** Return `true` ONLY if the driver is rested AND the vehicle safety checklist is checked, AND the weather is NOT severe.
        

### 📁 `ForLoops.java` (Counting & Repeating)

1. **`calculateDepreciation`**
* **Goal:** Calculate the long-term compound value reduction of a vehicle asset.
* **Logic:** Use a regular `for` loop to step through a fixed sequence of years. Each year, calculate how much value the car loses based on the rate, and subtract it from the current total value so it compounds over time.


2. **`totalFleetCapacity`**
* **Goal:** Sum up total passenger seat availability across your garage.
* **Logic:** You are handed an array of capacity numbers. Use a clean **enhanced for loop** (for-each) to read every number inside the array list one by one and accumulate them into a single final sum.


3. **`generateIntervalTimeline`**
* **Goal:** Build a sequential time block marker string.
* **Logic:** Use a standard `for` loop to count from a start hour up to and including an end hour. However, your update step needs to jump forward by a specific step size each time (e.g., jump by 2 hours). Append a dash `-` after each number into a string.
* *Example:* start=8, end=14, step=2 $\rightarrow$ `"8-10-12-14-"`


4. **`countTargetVehicles`**
* **Goal:** Count target items in an text array string database.
* **Logic:** Walk through a list of vehicle types using a loop. Compare each item to your target string (e.g., `"Car"`). Every time you find an exact match, increment your counter.


5. **`calculateRoutePermutations`**
* **Goal:** Solve a route combinations math configuration (factorial).
* **Logic:** For an input integer $n$, use a loop to multiply all numbers from $n$ down to 1.
* *Example:* Input 5 $\rightarrow$ calculate $5 \times 4 \times 3 \times 2 \times 1 = 120$.

        

### 📁 `WhileLoops.java` (Looping Until Stopped)

1. **`simulateDriveDistance`**
* **Goal:** Simulate driving distance milestones until your fuel run dry.
* **Logic:** Run a while loop that continues as long as your remaining fuel is enough to cover a full driving stint. In each round, add 100 to your total distance tracker and subtract the stint fuel usage from your fuel tank.


2. **`trackingYearsToProfitTarget`**
* **Goal:** Measure how long an investment account takes to hit a target.
* **Logic:** While your capital balance is smaller than your goal, calculate the annual interest yield (`balance * yield`), add it to your balance, and increment your year counter.


3. **`sumOdometerDigits`**
* **Goal:** Split an integer up mathematically and add its digits together.
* **Logic:** While the number is greater than 0, use the remainder operator `% 10` to peel off the last digit and add it to a sum. Then use division `/ 10` to discard that last digit before the next loop check.
* *Example:* 1356 $\rightarrow$ Calculate $1 + 3 + 5 + 6 = 15$.


4. **`drainHydraulicFluid`**
* **Goal:** Empty a fluid tank safely down to zero without leaving invalid data.
* **Logic:** Use a while loop to continually subtract a drainage rate from the fluid level until the level drops to or below 0. If the calculation accidentally drops past zero into a negative number, normalize it to return exactly `0`.


5. **`findFirstAvailableBay`**
* **Goal:** Scan through a row of mechanics' maintenance slots.
* **Logic:** You are given an array of booleans where `true` means occupied and `false` means open. Use a while loop to advance an index pointer forward as long as slots are occupied. Return the first index that is empty (`false`). If the whole array is full, return `-1`.
        

## 3. How to Compile and Run Your Work

Open your terminal application, change directory into your project workspace (`cd activity6`), and use these native Maven commands:

* **To compile your code and verify there are no syntax typos:**
bash
mvn compile




* **To execute the automated unit test matrix and see your scores:**
bash
mvn test









