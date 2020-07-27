package lesson0.kyu7;

import java.util.ArrayList;
import java.util.List;

public class SimpleRemoveDuplicates {

    public static int[] solve(int[] arr) {
        List<Integer> notRepeatingNumbers = new ArrayList<Integer>();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (!notRepeatingNumbers.contains(arr[i])) {
                notRepeatingNumbers.add(0,arr[i]);
            }
        }

        int[] arrayWithAllNumbersUnique = new int[notRepeatingNumbers.size()];

        for (int i = 0; i < notRepeatingNumbers.size(); i++) {
            arrayWithAllNumbersUnique[i] = notRepeatingNumbers.get(i);
        }

        return arrayWithAllNumbersUnique;
    }
}
