package lesson0.kyu1;

import java.util.ArrayList;
import java.util.List;

public class SquareSums {
    public static void main(String[] args){
        System.out.println(buildUpTo(26));
    }

    public static List<Integer> buildUpTo(int n) {
        for (int startIndex = 0; startIndex < n; startIndex++) {
            List<Integer> result = new ArrayList<Integer>();
            int[] temp = new int[n];

            for (int i = 0; i < n; i++) {
                temp[i] = i + 1;
            }
            result.add(temp[startIndex]);

            int counterForResult = 0;
            for (int i = 0; i < n; i++) {
                int counterForTemp = 0;
                for (int j = 0; j < n; j++) {
                    if (isSquare(temp[counterForTemp] + result.get(counterForResult))
                            && !result.contains(temp[counterForTemp])
                            && temp[counterForTemp] != 0) {
                        result.add(temp[counterForTemp]);
                        temp[counterForTemp] = 0;
                        counterForResult++;
                    }
                    counterForTemp++;
                }
            }

            if (result.size() == n) {
                return result;
            }
        }

        return null;
    }

    public static boolean isSquare(int number) {
        if (number <= 0) {
            return false;
        }

        for (int i = 0; i < number; i++) {
            if (i * i == number) {
                return true;
            }
        }

        return false;
    }
}
