package lesson0.kyu6;

import java.math.BigDecimal;

public class Xbonacci {

    public static double[] xbonacci(double[] signature, int n) {
        double[] result = new double[n];

        for (int i = 0; i < n; i++) {
            if (i < signature.length) {
                result[i] = signature[i];
            } else {
                BigDecimal temp = new BigDecimal("0");
                for (int j = i - signature.length; j < i; j++) {
                    temp = temp.add(BigDecimal.valueOf(result[j]));
                }
                result[i] = temp.doubleValue();
            }
        }
        return result;
    }
}
