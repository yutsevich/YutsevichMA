package lesson0;

import java.text.DecimalFormat;

public class HumanReadableTime {

    public static String makeReadable(int seconds) {
        DecimalFormat myFormatter = new DecimalFormat("00");
        return myFormatter.format((seconds % 86400) / 3600) +
                ":" + myFormatter.format(((seconds % 86400) % 3600) / 60) +
                ":" + myFormatter.format(((seconds % 86400) % 3600) % 60);
    }
}
