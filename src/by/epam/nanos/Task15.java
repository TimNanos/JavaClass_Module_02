package by.epam.nanos;

public class Task15 {
    static final double a = 0.0;// не теряем атрибуты доступа
    static final double b = 1.0;
    static final double h = 0.1;

    Task15() {
        System.out.println("\nTask 15");

        double x = a;
        System.out.println("x    F(x)");
        do {
            System.out.println(x + "  " + getCalculatedValue(x));
            x += h;
        }
        while (x <= b);
    }

    private double getCalculatedValue(double x){
        return 2 * Math.tan(x/2) + 1;
    }
}
