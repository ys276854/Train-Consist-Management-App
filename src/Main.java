import java.util.*;
import java.util.stream.Collectors;

// Bogie class
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

// Main class
public class Main {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App : UC8 ===");

        // Create bogie list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        System.out.println("\nAll Bogies:");
        bogies.forEach(System.out::println);

        // Stream filtering (capacity > 60)
        List<Bogie> filteredBogies =
                bogies.stream()
                        .filter(b -> b.capacity > 60)
                        .collect(Collectors.toList());

        System.out.println("\nFiltered Bogies (Capacity > 60):");
        filteredBogies.forEach(System.out::println);
    }
}