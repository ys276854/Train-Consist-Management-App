import java.util.*;
import java.util.stream.*;

public class TrainConsistManagementApp {

    // Goods Bogie class
    static class GoodsBogie {
        private String type;
        private String cargo;

        public GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        public String getType() {
            return type;
        }

        public String getCargo() {
            return cargo;
        }
    }

    // UC12 Safety Validation Method
    public static boolean isTrainSafetyCompliant(List<GoodsBogie> bogies) {

        // Stream + allMatch + Lambda Expression
        return bogies.stream()
                .allMatch(bogie ->
                        !bogie.getType().equalsIgnoreCase("Cylindrical")
                                || bogie.getCargo().equalsIgnoreCase("Petroleum")
                );
    }

    // Demo Main Method
    public static void main(String[] args) {

        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Open", "Coal"));
        bogies.add(new GoodsBogie("Box", "Grain"));

        boolean safe = isTrainSafetyCompliant(bogies);

        if (safe)
            System.out.println("Train is SAFETY COMPLIANT ✅");
        else
            System.out.println("Train is NOT SAFE ❌");
    }
}