package by.epam.nanos;

import java.util.Random;

public class Task13 {
    double a;
    double b;
    double c;
    double d;

    Task13() {
        System.out.println("\nTask 13");

        Random random = new Random();
        double a = random.nextDouble();
        double b = random.nextDouble();
        double c = random.nextDouble();
        double d = random.nextDouble();

        System.out.println("Values: a = " + a + ", b = " + b + ", c = " + c + ", d = " + d + "\nProblem A: " + calculateA() + ", Problem B: " + calculateB());
    }

    private double calculateA(){
        return (b + Math.sqrt(b*b + 4*a*c))/(2*a) - a*a*a*c + b;
    }

    private double calculateB() {
        return (a/c)*(b/d) - (a*b - c)/c*d;
    }
}
