public class SecondsAndMinutesChallenge {
    public static String getDurationString (int minutes, int seconds){
        if((minutes < 0) || (seconds < 0) || (seconds > 59)){
            System.out.println("Invalid Value");
            return "Invalid Value";
    } else {
        int hours = minutes / 60;
        int minutesLeft = minutes % 60;

        return minutes + " minutes and " + seconds + " seconds = " + hours +"h " + minutesLeft + "m " + seconds + "s";
    }
    }

    public static String getDurationString (int seconds){
        if(seconds < 0){
            return ("Invalid Statement");
        } else {
            int minutes = seconds / 60;
            int secondsLeft = seconds % 60;
            return getDurationString(minutes,secondsLeft);
        }
    }
}
