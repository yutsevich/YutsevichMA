package lesson0.kyu6;

public class FindOdd {

    public static int findIt(int[] a) {
        for (int temp : a) {
            int counter = 0;

            for (int value : a) {
                if (temp == value) {
                    counter++;
                }
            }

            if(counter%2 != 0){
                return temp;
            }
        }

        return 0;
    }
}
