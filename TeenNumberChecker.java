// program to demonstrate calling methods within methods

public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 20, 42));
    }

    public static boolean hasTeen(int x, int y, int z) {

        // check to see if any of the parameters in in range 13-19
        if(isTeen(x) == true || isTeen(y) == true || isTeen(z) == true) {
            return true;
        } else {
            return false;
        }

    } // end hasTeen()

    public static boolean isTeen(int x) {

        // check to see if the parameter in in range 13-19
        if (x >= 13 && x <= 19) {
            return true;
        } else {
            return false;
        }
    } // end isTeen()
}
