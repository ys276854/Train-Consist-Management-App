// TrainConsistAppUC5.java

// Import required packages
import java.util.LinkedHashSet;
import java.util.Set;

// Main class
public class Main {

    // Entry point of the program
    public static void main(String[] args) {

        // Step 1: Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Create LinkedHashSet for train formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // Step 3: Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Step 4: Attempt duplicate insertion
        trainFormation.add("Sleeper"); // duplicate (ignored automatically)

        // Step 5: Display final formation
        System.out.println("\nFinal Train Formation:");
        System.out.println(trainFormation);

        System.out.println("\nDuplicates automatically prevented.");
    }
}