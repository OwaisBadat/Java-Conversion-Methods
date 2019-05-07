public class TeenNumberChecker {

    public static boolean hasTeen ( int number1, int number2, int number3){
        if( isTeen(number1) || isTeen(number2) || isTeen(number3) ) {
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }

    public static boolean isTeen ( int number ){
        if (number >= 13 && number <=19) return true;
        return false;
    }
}
