public class LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1700));
        System.out.println(isLeapYear(2200));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2000));
    }

    public static boolean isLeapYear(int year) {

        // if year within range
        if (year >= 1 && year <= 9999 ) {
            // if year meets leap year requirements
            if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    } // end isLeapYear()
}
