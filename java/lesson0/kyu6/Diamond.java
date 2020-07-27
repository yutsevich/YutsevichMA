package lesson0.kyu6;

public class Diamond {

    public static String print(int n) {
        if (n <= 0 || n % 2 == 0) {
            return null;
        }

        String result = "";
        int spaces = n / 2;
        int carats = 1;
        for (int i = 0; i < n + 1; i++) {
            if (i < n / 2 + 1) {
                for (int j = 0; j < spaces; j++) {
                    result += " ";
                }
                spaces--;

                for (int j = 0; j < carats * 2 - 1; j++) {
                    result += "*";
                }
                carats++;
                result += "\n";
            } else if (i == n / 2 + 1) {
                spaces++;
                carats--;
            } else {
                spaces++;
                for (int j = 0; j < spaces; j++) {
                    result += " ";
                }

                carats--;
                for (int j = 0; j < carats * 2 - 1; j++) {
                    result += "*";
                }
                result += "\n";
            }
        }

        return result;
    }
}
