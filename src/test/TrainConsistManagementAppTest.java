import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    private List<TrainConsistManagementApp.Bogie> createSampleBogies() {

        return List.of(
                new TrainConsistManagementApp.Bogie("Sleeper", 72),
                new TrainConsistManagementApp.Bogie("AC Chair", 56),
                new TrainConsistManagementApp.Bogie("First Class", 24),
                new TrainConsistManagementApp.Bogie("Luxury", 80)
        );
    }

    // ✅ Loop filtering test
    @Test
    void testLoopFilteringLogic() {

        var result = TrainConsistManagementApp
                .filterUsingLoop(createSampleBogies());

        assertEquals(2, result.size());
    }

    // ✅ Stream filtering test
    @Test
    void testStreamFilteringLogic() {

        var result = TrainConsistManagementApp
                .filterUsingStream(createSampleBogies());

        assertEquals(2, result.size());
    }

    // ✅ Results must match
    @Test
    void testLoopAndStreamResultsMatch() {

        var loopResult = TrainConsistManagementApp
                .filterUsingLoop(createSampleBogies());

        var streamResult = TrainConsistManagementApp
                .filterUsingStream(createSampleBogies());

        assertEquals(loopResult.size(), streamResult.size());
    }

    // ✅ Execution time check
    @Test
    void testExecutionTimeMeasurement() {

        long time = TrainConsistManagementApp
                .measureExecutionTime(() -> {
                    int sum = 0;
                    for (int i = 0; i < 1000; i++)
                        sum += i;
                });

        assertTrue(time > 0);
    }

    // ✅ Large dataset test
    @Test
    void testLargeDatasetProcessing() {

        List<TrainConsistManagementApp.Bogie> bigList = new ArrayList<>();

        for (int i = 0; i < 5000; i++) {
            bigList.add(new TrainConsistManagementApp.Bogie("B" + i, i % 100));
        }

        var result = TrainConsistManagementApp.filterUsingStream(bigList);

        assertNotNull(result);
    }
}