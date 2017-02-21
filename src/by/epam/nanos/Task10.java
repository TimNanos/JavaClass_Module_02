package by.epam.nanos;

import java.util.Random;

public class Task10 {
    private static final int maxNumberAmount = 10;

    Task10(){
        System.out.println("\nTask 10");

        Random random = new Random();
        int numbersAmount = random.nextInt(maxNumberAmount);
        System.out.println("Numbers amount: " + numbersAmount);

        System.out.print("Numbers: ");
        String truncatedNumbers = "";
        int evenCount = 0;
        int moreThan15Count = 0;

        for (int i = 0; i < numbersAmount; i++) {
            double randomDouble = random.nextDouble();
            System.out.print(randomDouble);

            long truncatedRandomDouble = truncate(randomDouble);

            if (isEven(truncatedRandomDouble)) {
                evenCount++;
            }

            if (isMoreThan15(truncatedRandomDouble)) {
                moreThan15Count++;
            }

            truncatedNumbers = truncatedNumbers + truncatedRandomDouble;
            if (i < numbersAmount - 1) {
                System.out.print(", ");
                truncatedNumbers = truncatedNumbers + ", ";
            } else {
                System.out.println("\n" + truncatedNumbers);
            }
        }
        System.out.println("Even numbers: " + evenCount + ", More than 15: " + moreThan15Count);
    }

    private long truncate(double value) {
        return (long)value;
    }

    private boolean isEven(long value){
        return value % 2 == 0;
    }

    private boolean isMoreThan15(long value) {
        return value > 15;
    }
}
