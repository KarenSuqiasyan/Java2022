package Lesson2CallBack;

public class Worker extends Human implements OnBossListener {

    public Worker(String name, int age) {
        super(name, age);
    }

    @Override
    public void onBossNewsListened(String bossNews) {

        System.out.println("worker " + getName() + " with age " + getAge() + " informed from boss " + bossNews);

    }
}
