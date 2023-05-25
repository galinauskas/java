public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2490);
    }

    // method to conver KB into MB and KB
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int mb = kiloBytes / 1024; // MB value
        int r = kiloBytes % 1024; // remainder value


        System.out.println( kiloBytes + "KB = " + mb + "MB and " + r + "KB");
    } // end printMegaBytesAndKiloBytes()
}
