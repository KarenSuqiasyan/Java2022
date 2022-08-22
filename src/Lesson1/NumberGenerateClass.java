package Lesson1;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class NumberGenerateClass {

    private int count = 0;

    public Random random = new Random();
    public Scanner myObj = new Scanner(System.in);

    private WinLoseListener winLoseListener;
    int sum;

    int a, b;

    public void randomNumberMethod() {

        a = random.nextInt(10);
        b = random.nextInt(10);
        System.out.print(a + " + " + b + " = ");
        sum = myObj.nextInt();
        if (sum == a + b) {
            count++;
            randomNumberMethod();
        } else  {
            System.out.println("you lose your score is " + count );
        }
    }
}