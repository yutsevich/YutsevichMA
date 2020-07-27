package lesson0.kyu7;

public class FixStringCase {

    public static String solve(final String str) {
        int countUpper = 0;
        int countLow = 0;
        for (String symbol : str.split("")) {
            if (symbol.toLowerCase().equals(symbol)) {
                countLow++;
            } else countUpper++;
        }

        if (countLow < countUpper) {
            return str.toUpperCase();
        }
        return str.toLowerCase();
    }
}
