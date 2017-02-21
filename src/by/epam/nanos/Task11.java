package by.epam.nanos;

import java.util.Random;

public class Task11 {
    private static final int maxNumberAmount = 10;

    Task11() {
        System.out.println("\nTask 11");

        Random random = new Random();
        int numbersAmount = random.nextInt(maxNumberAmount);
        System.out.println("Numbers amount: " + numbersAmount);

        int moreThan15OrLessThan2Count = 0;
        int dividedBy5WithModule4Sum = 0;

        System.out.print("Numbers: ");
        for (int i = 0; i< numbersAmount; i++) {
            int randomInt = random.nextInt();

            System.out.print(randomInt);
            if (i < numbersAmount - 1) {
                System.out.print(", ");
            } else {
                System.out.println();
            }

            if (isMoreThan15OrLessThan2(randomInt)) {
                moreThan15OrLessThan2Count++;
            }

            if (isDividedBy5WithModule4(randomInt)) {
                dividedBy5WithModule4Sum += randomInt;
            }
        }

        System.out.println("More than 15 or less than 2: " + moreThan15OrLessThan2Count + ", Divided by 5 with module 4 sum: " + dividedBy5WithModule4Sum);
    }

    private boolean isMoreThan15OrLessThan2(int value) {
        return value > 15 || value < 2;
    }

    private boolean isDividedBy5WithModule4(int value) {
        return value % 5 == 4;
    }
}
