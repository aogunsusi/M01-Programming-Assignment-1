public class Main {
    public static void main(String[] args) {

        // Call the main method of Conversion class
        Conversion.main(args);
    }
}

class Conversion {
    /** Convert from feet to meters */
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    /** Convert from meters to feet */
    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }

    public static void main(String[] args) {
        // Print the table headers
        System.out.printf("%-10s%-15s | %-10s%-15s\n", "Feet", "Meters", "Meters", "Feet");
        System.out.println("-----------------------------------------------------");

        // Loop to print the conversion table
        for (int i = 1, j = 20; i <= 10; i++, j += 5) {
            double feet = i;
            double meters = j;

            System.out.printf("%-10.1f%-15.3f | %-10.1f%-15.3f\n",
                    feet, footToMeter(feet),
                    meters, meterToFoot(meters));
        }
    }
}