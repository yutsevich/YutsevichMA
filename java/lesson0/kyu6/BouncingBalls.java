package lesson0.kyu6;

public class BouncingBalls {

    public static int bouncingBall(double h, double bounce, double window) {
        if (h <= 0 || bounce >= 1 || bounce <= 0 || window >= h) {
            return -1;
        }

        int counter = 0;

        while (h > window) {
            ++counter;
            h = h * bounce;
            if(h>window){
                ++counter;
            }
        }

        return counter;
    }
}
