package lesson0.kyu6;

public class BitCounting {

    public static int countBits(int n) {
        int countBits = 0;
        for (char bit : Integer.toBinaryString(n).toCharArray()) {
            if (bit == '1') {
                countBits++;
            }
        }
        return countBits;
    }
}
