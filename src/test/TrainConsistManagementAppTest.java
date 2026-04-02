import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    // ✅ All valid bogies
    @Test
    void testSafety_AllBogiesValid() {

        List<TrainConsistManagementApp.GoodsBogie> bogies = List.of(
                new TrainConsistManagementApp.GoodsBogie("Cylindrical", "Petroleum"),
                new TrainConsistManagementApp.GoodsBogie("Open", "Coal")
        );

        assertTrue(TrainConsistManagementApp.isTrainSafetyCompliant(bogies));
    }

    // ❌ Cylindrical with wrong cargo
    @Test
    void testSafety_CylindricalWithInvalidCargo() {

        List<TrainConsistManagementApp.GoodsBogie> bogies = List.of(
                new TrainConsistManagementApp.GoodsBogie("Cylindrical", "Coal")
        );

        assertFalse(TrainConsistManagementApp.isTrainSafetyCompliant(bogies));
    }

    // ✅ Non cylindrical allowed
    @Test
    void testSafety_NonCylindricalBogiesAllowed() {

        List<TrainConsistManagementApp.GoodsBogie> bogies = List.of(
                new TrainConsistManagementApp.GoodsBogie("Open", "Coal"),
                new TrainConsistManagementApp.GoodsBogie("Box", "Grain")
        );

        assertTrue(TrainConsistManagementApp.isTrainSafetyCompliant(bogies));
    }

    // ❌ Mixed violation
    @Test
    void testSafety_MixedBogiesWithViolation() {

        List<TrainConsistManagementApp.GoodsBogie> bogies = List.of(
                new TrainConsistManagementApp.GoodsBogie("Cylindrical", "Petroleum"),
                new TrainConsistManagementApp.GoodsBogie("Cylindrical", "Coal")
        );

        assertFalse(TrainConsistManagementApp.isTrainSafetyCompliant(bogies));
    }

    // ✅ Empty list case
    @Test
    void testSafety_EmptyBogieList() {

        List<TrainConsistManagementApp.GoodsBogie> bogies = new ArrayList<>();

        assertTrue(TrainConsistManagementApp.isTrainSafetyCompliant(bogies));
    }
}