public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces ( double number1, double number2 ){

        int n1 = (int) (number1 * 1000);
        int n2 = (int) (number2 * 1000);


        if ( n1 == n2){
            System.out.println("True");
            return true;
        }
        System.out.println("False");
        return false;
    }
}
