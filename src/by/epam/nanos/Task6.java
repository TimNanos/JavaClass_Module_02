package by.epam.nanos;

import java.util.Random;

public class Task6 {

    Task6(){
        double a;
        double b;
        double c;

        System.out.println("Task 6");

        Random random = new Random();
        a = random.nextDouble();
        b = random.nextDouble();
        c = random.nextDouble();

        System.out.println("Values: " + a + ", " + b + ", " + c + ". Result: " + calculate(a, b, c));
    }

    public static double calculate(double a, double b, double c){
        return a * a - (b - c) * (b - c) + Math.exp(b * b + 1);
    }
}
