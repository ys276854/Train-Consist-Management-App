// TrainConsistAppUC2.java

// Import required packages
import java.util.ArrayList;
import java.util.List;

// Main class
public class Main {

    // Entry point of program
    public static void main(String[] args) {

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Create ArrayList for Passenger Bogies
        List<String> passengerBogies = new ArrayList<>();

        // Step 3: Add Passenger Bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("\nPassenger bogies after addition:");
        System.out.println(passengerBogies);

        // Step 4: Remove a Bogie (AC Chair)
        passengerBogies.remove("AC Chair");

        System.out.println("\nPassenger bogies after removal:");
        System.out.println(passengerBogies);

        // Step 5: Check existence of Sleeper bogie
        boolean exists = passengerBogies.contains("Sleeper");

        System.out.println("\nDoes Sleeper bogie exist? " + exists);

        // Step 6: Final List State
        System.out.println("\nFinal Passenger Bogie List:");
        System.out.println(passengerBogies);

        // Program continues
        System.out.println("\nSystem ready for next operations...");
    }
}