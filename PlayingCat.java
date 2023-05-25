public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {

        // higher upper bound if it's summer
        if (summer == true) {
            if (temperature <= 45 && temperature >= 25) {
                return true;
            } else {
                return false;
            }
        } else {
            if (temperature <= 35 && temperature >= 25) {
                return true;
            } else {
                return false;
            }
        }
    } // end isCatPlaying() 
}
