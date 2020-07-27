package lesson0.kyu6;

import java.util.ArrayList;
import java.util.List;

public class DeadFish {

    public static int[] parse(String data) {
        List<Integer> result = new ArrayList<Integer>();
        int value = 0;

        for (char symbol : data.toCharArray()) {
            switch (symbol) {
                case 'i':
                    value++;
                    break;
                case 'd':
                    value--;
                    break;
                case 's':
                    value = value * value;
                    break;
                case 'o':
                    result.add(value);
                    break;
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}
