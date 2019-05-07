public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes (int kiloBytes){
        int divisor = 1024;

        int quotient = kiloBytes / divisor;
        int remainder = kiloBytes % divisor;

        if (quotient < 0 || remainder < 0){
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + quotient + " MB and " + remainder +" KB");
        }
    }
}
