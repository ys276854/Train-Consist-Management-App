// TrainConsistAppUC7.java

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Bogie class (Custom Object)
class Bogie {

    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Display method
    public String toString() {
        return name + " -> Capacity: " + capacity;
    }
}

// Main Application Class
public class Main {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create List of Bogies
        List<Bogie> bogies = new ArrayList<>();

        // Step 2: Add passenger bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        // Step 3: Sort using Comparator (by capacity)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // Step 4: Display sorted bogies
        System.out.println("\nBogies Sorted by Capacity:");

        for (Bogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("\nSorting completed successfully.");
    }
}