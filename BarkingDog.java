public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        // if the dog is not barking or its not a real time of day
        if (barking == false || hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else {
            // if its before 8:00 or after 22:00
            if (hourOfDay < 8 || hourOfDay > 22) {
                return true;
            } else {
                return false;
            }
        } 
    } // end shouldWakeUp()
}
