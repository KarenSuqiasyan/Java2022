package Lesson7;

public class Main {

    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        System.out.println("Main thread started");
        Thread thread = new Thread(myThread);
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " in Main Thread");
        }
        MyThread.isActive = false;
        System.out.println("Main Thread Finished");
    }
}
