package by.epam.nanos;

import java.util.Random;

public class Task7 {
    Task7(){
        System.out.println("\nTask 7");

        Random random = new Random();
        int a = random.nextInt();
        int b = random.nextInt();

        System.out.print("Values: a = " + a + ", b = " + b);
        if (a > b) {
            int c = random.nextInt();
            int bc = b + c;
            System.out.println(", c = " + c + ", b + c = " + bc);
        }
        if (a == b) {
            System.out.println("\nКонец");
        }
        if (a < b) {
            int c = random.nextInt();
            int abc = a + b + c;
            System.out.println(", c = " + c + ", a + b + c = " + abc + ". Новый год!");
        }
    }
}
