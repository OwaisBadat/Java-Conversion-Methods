public class Main {

    public static void main(String[] args) {
        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        MegaBytesConverter.printMegaBytesAndKiloBytes(-1);
        MegaBytesConverter.printMegaBytesAndKiloBytes(1024);
        BarkingDog.shouldWakeUp(true, 1);
        BarkingDog.shouldWakeUp(false, 2);
        BarkingDog.shouldWakeUp(true, 8);
        BarkingDog.shouldWakeUp(true, -1);
        LeapYear.isLeapYear(1924);
        DecimalComparator.areEqualByThreeDecimalPlaces(-3.175, -3.1756);
        DecimalComparator.areEqualByThreeDecimalPlaces(-3.175, -3.176);
        DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0);
        EqualSumChecker.hasEqualSum(1,1,2);
        EqualSumChecker.hasEqualSum(2,1,4);
        TeenNumberChecker.hasTeen(10,12,11);
        FeetAndInchesToCentimeters.calcFeetAndInchesToCentimeters(10,-10);

        FeetAndInchesToCentimeters.calFeetAndInchesToCentimeters(-10);
        System.out.println(SecondsAndMinutesChallenge.getDurationString(65, 45));
        System.out.println(SecondsAndMinutesChallenge.getDurationString(3945));
        System.out.println(AreaCalculator.area(-1));
        System.out.println(AreaCalculator.area(5.0,4.0));

        MinutesToYearsDaysCalculator.printYearsAndDays(561600);
        IntEqualityPrinter.printEqual(1,1,1);
        IntEqualityPrinter.printEqual(1,1,2);
        IntEqualityPrinter.printEqual(-1,-1,-1);
        IntEqualityPrinter.printEqual(1,2,3);

        System.out.println(PlayingCat.isCatPlaying(true,10));
        System.out.println(PlayingCat.isCatPlaying(false,36));
        System.out.println(PlayingCat.isCatPlaying(false,35));


    }

}
