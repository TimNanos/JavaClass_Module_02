package by.epam.nanos;

import java.util.Random;

public class Task17 {
    Task17() {
        System.out.println("\nTask 17");

        Random random = new Random();
        double x = random.nextDouble();

        System.out.println("x = " + x + ", Calculation result: " + doTheMath(x));
    }

    private double doTheMath(double x) {
        if (x <= -3) {
            return 9;
        }
        if (x > 3) {
            return 1 / (x*x + 1);
        }
        return Float.NaN;
    }
}
