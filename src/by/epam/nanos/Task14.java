package by.epam.nanos;

import java.util.Random;

public class Task14 {
    Task14() {
        System.out.println("\nTask 14");

        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            double randomDouble = random.nextDouble();
            System.out.print("Value: " + randomDouble);

            if (isNotNegative(randomDouble)) {
                System.out.println(", Powered by 2: " + Math.pow(randomDouble, 2));
            } else {
                System.out.println(", Powered by 4: " + Math.pow(randomDouble, 4));
            }
        }
    }

    private boolean isNotNegative(double value) {
        return value >= 0;
    }
}
