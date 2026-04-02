// TrainConsistAppUC6.java

// Import required packages
import java.util.HashMap;
import java.util.Map;

// Main class
public class Main {

    // Entry point of program
    public static void main(String[] args) {

        // Step 1: Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Create HashMap (Bogie -> Capacity)
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // Step 3: Insert bogie capacity details
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 24);

        // Step 4: Display capacity details
        System.out.println("\nBogie Capacity Details:");

        // Iterating using entrySet()
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {

            String bogie = entry.getKey();
            int capacity = entry.getValue();

            System.out.println(bogie + " -> Capacity: " + capacity);
        }

        System.out.println("\nCapacity mapping completed successfully.");
    }
}