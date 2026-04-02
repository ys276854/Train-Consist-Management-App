// TrainConsistAppUC4.java

// Import required package
import java.util.LinkedList;

// Main class
public class Main {

    // Entry point of program
    public static void main(String[] args) {

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Create LinkedList for Train Consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Step 3: Add Bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("\nInitial Train Consist:");
        System.out.println(trainConsist);

        // Step 4: Insert Pantry Car at position 2 (index starts from 0)
        trainConsist.add(2, "Pantry Car");

        System.out.println("\nAfter adding Pantry Car at position 2:");
        System.out.println(trainConsist);

        // Step 5: Remove first and last bogie
        trainConsist.removeFirst();
        trainConsist.removeLast();

        // Step 6: Display final ordered consist
        System.out.println("\nFinal Ordered Train Consist:");
        System.out.println(trainConsist);

        System.out.println("\nTrain arrangement maintained successfully.");
    }
}