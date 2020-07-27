package lesson0.kyu6;

public class CountingDuplicates {

    public static int duplicateCount(String text) {
        int commonCounter = 0;
        String repeatingSymbols = "";

        for (int i = 0; i < text.length(); i++) {
            int tempCounter = 0;
            char symbol = text.toLowerCase().charAt(i);

            for (int j = 0; j < text.length(); j++) {
                if (symbol == text.toLowerCase().charAt(j) && i != j && !repeatingSymbols.contains(String.valueOf(symbol))) {
                    tempCounter++;
                    repeatingSymbols += symbol;
                }
            }
            if (tempCounter > 0) {
                commonCounter++;
            }
        }

        return commonCounter;
    }
}
