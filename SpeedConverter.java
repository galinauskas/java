public class SpeedConverter {
    public static void main(String[] args) {
        printConversion(1.5);
    }

    // method for km to miles conversion
    public static long toMilesPerHour(double kilometersPerHour) {
        double m;
        
        if (kilometersPerHour >= 0) {
            m = kilometersPerHour * 0.621371;

            // return the rounded result
            return Math.round(m);

        } else {
            // return -1 is negative value
            return -1;
        }
    } // end toMilesPerHour()

    // method for printing conversion
    public static void printConversion(double kilometersPerHour) {
        double m = toMilesPerHour(kilometersPerHour);

        System.out.println(kilometersPerHour + "km/h = " + m + "mi/h");
    } // end printConversion()
}