package lesson0.kyu6;

public class SimpleSquareNumbers {

    public static long solve(int n) {
        long temp = 1;
        long N = 1;

        while (N <= (long) n * n) {
            if (((long) Math.sqrt(N + n) * (long) Math.sqrt(N + n) == N + n)) {

                return N;
            }
            temp++;
            N = temp * temp;
        }

        return -1;
    }
}
