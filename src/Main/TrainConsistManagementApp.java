import java.util.*;
import java.util.stream.Collectors;

public class TrainConsistManagementApp {

    // Bogie class
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        public int getCapacity() {
            return capacity;
        }

        @Override
        public String toString() {
            return name + " - Capacity: " + capacity;
        }
    }

    // ===============================
    // LOOP BASED FILTERING
    // ===============================
    public static List<Bogie> filterUsingLoop(List<Bogie> bogies) {

        List<Bogie> result = new ArrayList<>();

        for (Bogie b : bogies) {
            if (b.getCapacity() > 60) {
                result.add(b);
            }
        }
        return result;
    }

    // ===============================
    // STREAM BASED FILTERING
    // ===============================
    public static List<Bogie> filterUsingStream(List<Bogie> bogies) {

        return bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());
    }

    // ===============================
    // PERFORMANCE MEASUREMENT
    // ===============================
    public static long measureExecutionTime(Runnable task) {

        long start = System.nanoTime();

        task.run();

        long end = System.nanoTime();

        return end - start;
    }

    // ===============================
    // MAIN METHOD (UC13 DEMO)
    // ===============================
    public static void main(String[] args) {

        System.out.println("=== UC13: Loop vs Stream Performance ===");

        List<Bogie> bogies = new ArrayList<>();

        // Create sample dataset
        for (int i = 1; i <= 10000; i++) {
            bogies.add(new Bogie("Bogie-" + i, (i % 100)));
        }

        // Loop timing
        long loopTime = measureExecutionTime(() ->
                filterUsingLoop(bogies));

        // Stream timing
        long streamTime = measureExecutionTime(() ->
                filterUsingStream(bogies));

        System.out.println("Loop Execution Time   : " + loopTime + " ns");
        System.out.println("Stream Execution Time : " + streamTime + " ns");
    }
}