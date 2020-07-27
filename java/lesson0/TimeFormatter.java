package lesson0;

public class TimeFormatter {

    public static String formatDuration(int seconds) {
        String result = "";
        int d = seconds / 86400;
        int h = (seconds - 86400 * d) / 3600;
        int m = (seconds - 3600 * h) / 60;
        int s = seconds - seconds % 360;


        if (d != 0) {
            result += d + "days";
        }
        if (h != 0) {
            result += h + "hours";
        }
        if (m != 0) {
            result += m + "minutes";
        }
        if (s != 0) {
            result += s + "seconds";
        }
        return result;
    }


}
