
public class Main {
    public static void main(String[] args) {

        System.out.println(getDurationString(3954));
        System.out.println(getDurationString(65,54));
    }

    public static String getDurationString(int seconds){

        if (seconds < 0){
            return "Invalid date for seconds("+seconds+"), must be positive integer value";
        }
        int minutes = seconds / 60;
        return getDurationString(seconds / 60,seconds % 60);
    }

    public static String getDurationString(int minutes,int seconds){

        if (minutes < 0 ){
            return "Invalid date for minutes("+minutes+"), must be positive integer value";

        }else if (seconds <= 0 || seconds >= 59 ){
            return "Invalid date for seconds("+seconds+"), must be between 0 and 59";
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        return hours+"h " + remainingMinutes+"m "+seconds+"s";

    }
}