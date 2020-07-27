package lesson0.kyu5;

public class StringMerger {

    public static boolean isMerge(String s, String part1, String part2) {
        for (int i = 0; i < s.length(); i++) {
            int counter1 = 0;
            int counter2 = 0;

            if(part1.charAt(counter1) != s.charAt(i) && part2.charAt(counter2) != s.charAt(i)){
                return false;
            }
            counter1++;
            counter2++;
        }
        return true;
    }
}
