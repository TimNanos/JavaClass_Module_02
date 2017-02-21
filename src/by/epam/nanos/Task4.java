package by.epam.nanos;

import java.util.Random;

public class Task4 {
    private double leg1;
    private double leg2;

    public Task4(){
        System.out.println("Task 4");

        // Get random triangle
        Random rand = new Random();
        leg1 = rand.nextDouble();
        leg2 = rand.nextDouble();

        // Print the numbers
        System.out.println("Triangle legs: " + leg1 + " and " + leg2 + ". Hypotenuse: " + getHypotenuse() + ". Area: " + getArea());
    }

    double getHypotenuse(){
        return Math.sqrt(leg1*leg1 + leg2*leg2);
    }

    double getArea(){
        return leg1*leg2/2;
    }
}
