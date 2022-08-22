package Lesson7;

public class MyThread implements Runnable {

    public static boolean isActive = true;
    int count = 0;

    @Override
    public void run() {
        System.out.println("MyThread Started");
        while (isActive) {
            count++;
            System.out.println(count + " in MyThread");
        }
        System.out.println("MyThread Finished");
    }
}



