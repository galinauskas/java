public class EqualByThree {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

    public static boolean areEqualByThreeDecimalPlaces(double x, double y) {
        // move decimal point over and compare parameters as ints
        int multiX = (int)(x * 1000);
        int multiY = (int)(y * 1000);

        return multiX == multiY;
    } // end areEqualByThreeDecimalPlaces()
}
