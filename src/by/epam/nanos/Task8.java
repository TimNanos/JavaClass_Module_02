package by.epam.nanos;

import java.util.Random;

public class Task8 {
    Task8(){
        System.out.println("\nTask 8");

        Random random = new Random();
        int a = random.nextInt();
        int b = random.nextInt();

        System.out.print("Values: a = " + a + ", b = " + b);

        if (a == b) {
            System.out.println("\nскоро Новый Год!");
        } else {
            int c = random.nextInt();
            int abc = a + b + c;
            int a2b2 = a*a + b*b;
            System.out.println(", c = " + c + ", a + b + c = " + abc + ". a*a + b*b = " + a2b2 + ". моя любимая футбольная команда.");
        }
    }
}
