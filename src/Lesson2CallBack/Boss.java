package Lesson2CallBack;

import java.util.ArrayList;

public class Boss implements OnNewPostListener {

    ArrayList<Worker> workers = new HumanGenerator().workerGeneratorMethod();
    int count = 0;

    @Override
    public void onNewPostPublished(String content) {
        System.out.println("Boss notified about " + content);
    }

    public void bossNewsMethod(String bossNews) {
        for (Worker worker : workers) {
            if (worker.getAge() > 30) {
                worker.onBossNewsListened(bossNews);
                count++;
            }
        }
        System.out.println(count + " number of workers" + " from " + workers.size() + " is fired");
    }
}

