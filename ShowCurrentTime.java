public class ShowCurrentTime {
    public static void main(String[] args) {
        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliSeconds = System.currentTimeMillis();

        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliSeconds / 1000;

        // Compute the current seconds in the minute in the hour
        long currentSecond = totalSeconds % 60;

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = totalMinutes / 60;

        // Compute the current hour
        long currentHour = totalHours % 24;

        // Compute the current hour for Lagos (GMT+1)
        long currentHourLagos = currentHour + 1;

        // Display results
        System.out.println("Current time is " + currentHourLagos + ":" + currentMinute + ":" + currentSecond + " (GMT+1)");
    }
}