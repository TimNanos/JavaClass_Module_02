package by.epam.nanos;

import java.util.Random;

public class Task9 {
    private static final int  maxNumberAmount = 10;

    Task9(){
        System.out.println("\nTask 9");

        Random random = new Random();
        int numbersAmount = random.nextInt(maxNumberAmount);
        System.out.println("Numbers amount: " + numbersAmount);

        int evenAmount = 0;
        long sum3s = 0;
        int amount3s = 0;

        System.out.print("Numbers: ");
        for (int i = 0; i < numbersAmount; i++) {
            int randomInt = random.nextInt();

            System.out.print(randomInt);
            if (i < numbersAmount - 1) {
                System.out.print(", ");
            } else {
                System.out.println();
            }

            if (isEven(randomInt)) {
                evenAmount++;
            }

            if (isDivisibleBy3(randomInt)) {
                sum3s = sum3s + randomInt;
            }

            if (Math.abs(randomInt) < 3) {
                amount3s++;
            }
        }

        System.out.println("Even numbers: " + evenAmount + ", Divisible by 3 sum: " + sum3s + ", Abs less than 3: " + amount3s);
    }

    private boolean isEven(int value){
        return value%2 == 0;
    }

    private boolean isDivisibleBy3(int value){
        return value%3 == 0;
    }
}
