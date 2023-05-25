public class PositiveNegativeZero {
    public static void main(String[] args) {
        checkNumber(5);
        checkNumber(0);
        checkNumber(-1);
    }

    // method for checking if a number is postive, 
    // negative or equal to zero
    public static void checkNumber(int n) {
        if (n < 0) {
            System.out.println("Negative!");
        } else if (n > 0) {
            System.out.println("Postive!");
        } else {
            System.out.println("0!"); 
        }
    } // end checkNumber()
}