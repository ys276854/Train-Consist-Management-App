import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrainConsistManagementApp {

    // Regex Patterns
    private static final String TRAIN_ID_REGEX = "TRN-\\d{4}";
    private static final String CARGO_CODE_REGEX = "PET-[A-Z]{2}";

    private static final Pattern trainPattern =
            Pattern.compile(TRAIN_ID_REGEX);

    private static final Pattern cargoPattern =
            Pattern.compile(CARGO_CODE_REGEX);

    // Train ID Validation
    public static boolean validateTrainID(String trainID) {

        if (trainID == null || trainID.isEmpty())
            return false;

        Matcher matcher = trainPattern.matcher(trainID);
        return matcher.matches();
    }

    // Cargo Code Validation
    public static boolean validateCargoCode(String cargoCode) {

        if (cargoCode == null || cargoCode.isEmpty())
            return false;

        Matcher matcher = cargoPattern.matcher(cargoCode);
        return matcher.matches();
    }

    // Main Method (UC11)
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Train Consist Management App : UC11 ===");

        System.out.print("Enter Train ID: ");
        String trainID = sc.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCode = sc.nextLine();

        boolean trainValid = validateTrainID(trainID);
        boolean cargoValid = validateCargoCode(cargoCode);

        System.out.println("\nValidation Results:");

        System.out.println(
                trainValid ? "Train ID is VALID" : "Train ID is INVALID");

        System.out.println(
                cargoValid ? "Cargo Code is VALID" : "Cargo Code is INVALID");

        sc.close();
    }
}