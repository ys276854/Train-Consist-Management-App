// TrainConsistApp.java

// Import required packages
import java.util.ArrayList;
import java.util.List;

// Main class for Train Consist Management Application
public class Main {

    // Entry point of Java program
    public static void main(String[] args) {

        // Step 1: Display Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Initialize Train Consist
        // List interface with ArrayList implementation
        List<String> trainConsist = new ArrayList<>();

        // Step 3: Display Initial Bogie Count
        System.out.println("Train consist initialized successfully.");
        System.out.println("Initial Bogie Count : " + trainConsist.size());

        // Step 4: Program continues
        System.out.println("System ready to add bogies...");
    }
}