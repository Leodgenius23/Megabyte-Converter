package Class;

public class Main {
    public static void main(String[] args){
        System.out.println(getDurationString(65L,45L));
        System.out.println(getDurationString(3945L));

    }
    public static String getDurationString(long minutes, long seconds){
        if(minutes >= 0){
            if(seconds >= 0 && seconds <= 59){
                long hours = minutes / 60;
                long remainingMinutes = minutes % 60;

                String hourString = hours + "h";
                if(hours < 10){
                    hourString = "0" + hourString;
                }

                String minutesString = remainingMinutes + "h";
                if(remainingMinutes < 10){
                    minutesString = "0" + minutesString;
                }

                String secondString = seconds + "h";
                if(seconds < 10){
                    secondString = "0" + secondString;
                }
                return hourString + " " + minutesString + " " + secondString + "s";
            }
        }
       return "Invalid value";
        }

    public static String getDurationString(long seconds){
        if(seconds >= 0){
            long minutes = seconds / 60;
            long remainingSeconds = seconds % 60;
            return getDurationString(minutes, remainingSeconds);
        }
        return "Invalid value";
    }
}
