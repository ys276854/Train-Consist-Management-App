// TrainConsistAppUC3.java

// Import required packages
import java.util.HashSet;
import java.util.Set;

// Main class
public class Main {

    // Program entry point
    public static void main(String[] args) {

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Create HashSet for Bogie IDs
        Set<String> bogieIDs = new HashSet<>();

        // Step 3: Add Bogie IDs (including duplicates intentionally)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // Duplicate
        bogieIDs.add("BG102"); // Duplicate

        // Step 4: Display Unique Bogie IDs
        System.out.println("\nUnique Bogie IDs in Train:");
        System.out.println(bogieIDs);

        // Program continues
        System.out.println("\nDuplicate IDs automatically ignored.");
    }
}