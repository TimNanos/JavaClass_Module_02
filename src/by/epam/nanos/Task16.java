package by.epam.nanos;

import java.util.Random;

public class Task16 {
    Task16() {
        System.out.println("\nTask 16");

        Random random = new Random();
        double radius = random.nextDouble();

        System.out.println("Radius: " + radius + ", Circle length: " + getCircleLength(radius) + ", Circle area: " + getCircleArea(radius));
    }

    private double getCircleLength(double radius) {
        return 2 * Math.PI * radius;
    }

    private double getCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}
