import java.util.*;
import java.util.stream.*;


// Bogie Class (same as UC7–UC9)
class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Display method
    @Override
    public String toString() {
        return name + " - Capacity: " + capacity;
    }
}


// Main Application
public class Main{

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App : UC10 ===");

        // Create bogie list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        // Display bogies
        System.out.println("\nTrain Bogies:");
        bogies.forEach(System.out::println);

        // ✅ Stream Aggregation using reduce()
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)      // extract capacity
                .reduce(0, Integer::sum); // aggregate

        // Display result
        System.out.println("\nTotal Seating Capacity: " + totalSeats);
    }
}