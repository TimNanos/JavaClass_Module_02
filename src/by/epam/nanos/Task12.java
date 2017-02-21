package by.epam.nanos;

public class Task12 {
    Task12(String[] args) {
        System.out.println("\nTask 12");
        long sum = 0;

        for (int i = 0; i < args.length; i++) {
            int intValue = Integer.parseInt(args[i]);
            sum += intValue;
        }
        System.out.println("Sum: " + sum);
    }
}
