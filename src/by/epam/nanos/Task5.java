package by.epam.nanos;

import java.util.Random;

public class Task5 {
    Task5(){
        System.out.println("Task 5");

        // Get random values
        Random random = new Random();
        int int1 = random.nextInt();
        int int2 = random.nextInt();
        int int3 = random.nextInt();
        int int4 = random.nextInt();

        // Do the math
        System.out.println("Values: " + int1 + ", " + int2 + ", " + int3 + ", " + int4 + ". Sum: " + getSum(int1, int2, int3, int4));
        getSum(int1, int2, int3, int4);
    }

    long getSum(int int1, int int2, int int3, int int4){
        return int1 + int2 + int3 + int4;
    }
}
