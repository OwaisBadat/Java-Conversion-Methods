public class FeetAndInchesToCentimeters {

    public static double calcFeetAndInchesToCentimeters ( double feet, double inches){
        if ( (feet >= 0) && (inches <= 12) && (inches >= 0)) {
           double centimeters = (((feet*12)*2.54) + (inches * 2.54));
            System.out.println(centimeters + " CM");
            return centimeters;
        }
        return -1;
    }

    public static double calFeetAndInchesToCentimeters (double inches){
        if (inches >=0){
            double feet = (int) inches /12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches + " Inches is = " + feet + " ft and " + remainingInches +" inches.");
            return calcFeetAndInchesToCentimeters(feet,remainingInches);
        }
        return -1;
    }
}
