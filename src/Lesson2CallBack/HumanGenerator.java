package Lesson2CallBack;

import java.util.ArrayList;
import java.util.Random;

public class HumanGenerator {

    private ArrayList<User> usersList = new ArrayList<>();

    private ArrayList<Worker> workersList = new ArrayList<>();
    Random random = new Random();

    public ArrayList userGeneratorMethod() {
        for (int i = 0; i < 10; i++) {
            int age = random.nextInt(82) + 18;
            usersList.add(new User("name " + i, age));
        }
        return usersList;
    }
    public ArrayList<Worker> workerGeneratorMethod() {
        for (int i = 0; i < 100; i++) {
            int age = random.nextInt(82) + 18;
            workersList.add(new Worker("name " + i, age));
        }
        return workersList;
    }

}
