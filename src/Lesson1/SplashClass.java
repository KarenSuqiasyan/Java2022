package Lesson1;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class SplashClass {
    Scanner myObj = new Scanner(System.in);
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void splashMethod() throws InterruptedException {

        System.out.println("Hello please enter your name");
         name = myObj.nextLine();
        System.out.println("now we can play" + " " + name);
        int counter = 3;
        while (counter > 0) {
            System.out.println(counter + " sec");
            counter--;
            Thread.sleep(1000);
        }
        System.out.println("Go!");
    }
}
