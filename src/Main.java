import java.util.*;
import java.util.stream.Collectors;

// Bogie Class
class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Getter for grouping
    public String getName() {
        return name;
    }

    // Display method
    @Override
    public String toString() {
        return name + " - Capacity: " + capacity;
    }
}

// Main Application
public class Main {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App : UC9 ===");

        // Create Bogie List
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 72));   // duplicate type for grouping demo
        bogies.add(new Bogie("AC Chair", 56));

        // Display original list
        System.out.println("\nAll Bogies:");
        bogies.forEach(System.out::println);

        // Grouping using Stream API
        Map<String, List<Bogie>> groupedBogies =
                bogies.stream()
                        .collect(Collectors.groupingBy(Bogie::getName));

        // Display grouped result
        System.out.println("\nGrouped Bogies:");

        groupedBogies.forEach((type, list) -> {
            System.out.println("\n" + type + ":");
            list.forEach(System.out::println);
        });
    }
}